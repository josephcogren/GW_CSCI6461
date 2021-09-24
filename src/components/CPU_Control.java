package components;


public class CPU_Control{
	public ProgramCounter PC = new ProgramCounter();
	public General_Purpose_Registers GPRs = new General_Purpose_Registers();
	public Instruction_Register IR = new Instruction_Register();
	public Index_Registers IXR = new Index_Registers();
	public Memory_Address_Register MAR = new Memory_Address_Register();
	public Memory_Buffer_Register MBR = new Memory_Buffer_Register();
	public Memory Mem = new Memory();

	public CPU_Control(){
	}
// This sets the initial conditions of the machine before use
	public void initial(){
		PC = new ProgramCounter(7);
		GPRs = new General_Purpose_Registers();
		IR = new Instruction_Register();
		IXR = new Index_Registers(7, 100, 1000);
		MAR = new Memory_Address_Register();
		MBR = new Memory_Buffer_Register();
		Mem = new Memory(2048,7);
		Mem.writeMem(1, 6);
	}
// This command is for post-Project #1 to run a single cycle of our machine simulator.
	public void runsinglestep(){
		MAR.setMemaddress(PC.getPCaddress());
		PC.PCPlus();
		MBR.setData(Mem.readMem(MAR.getMemaddress()));
		IR.setinstruction(MBR.getData());
		switch(IR.getopcode()){
			case 1:
				Load();
				break;
			case 2:
				Store();
				break;
		}
	}
// This acts as the CPU load
	public void Load(){
		// Sets the EA to 0
		int EA = 0;
		// Then checks for an IR indirect in each register
		if (IR.getindirect() == 0) {
			if (IR.getindexregister() == 0) {
				EA = IR.getaddress();
			}
			else if (IR.getaddress() > 0 && IR.getaddress() < 4) {
				EA = IXR.getregister(IR.getindexregister()) + IR.getaddress();
			}
		}
		else if (IR.getindirect() == 1) {
			if (IR.getindexregister() == 0) {
				MAR.setMemaddress(IR.getaddress());
				MBR.setData(Mem.readMem(MAR.getMemaddress()));
				EA = MBR.getData();
			}
			else if (IR.getaddress() > 0 && IR.getaddress() < 4) {
				MAR.setMemaddress(IR.getaddress());
				MBR.setData(Mem.readMem(MAR.getMemaddress()));
				EA = IXR.getregister(IR.getindexregister()) + MBR.getData();
			}
		}
		// Then moves to set the memory address via the EA
		MAR.setMemaddress(EA);
		// Sets the MBR
		MBR.setData(Mem.readMem(MAR.getMemaddress()));
		// Sets the GPR
		GPRs.setregister(IR.getregister(), MBR.getData());
	}
	// Is our store function
	public void Store(){

	}
}