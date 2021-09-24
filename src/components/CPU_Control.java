package components;


public class CPU_Control{
	public ProgramCounter PC = new ProgramCounter();
	public General_Purpose_Registers GPRs = new General_Purpose_Registers();
	public Instruction_Register IR = new Instruction_Register();
	public Index_Registers IXR = new Index_Registers();
	public Memory_Address_Register MAR = new Memory_Address_Register();
	public Memory_Buffer_Register MBR = new Memory_Buffer_Register();
	public Machine_Fault_Register MFR = new Machine_Fault_Register();
	public Memory Mem = new Memory();

	public CPU_Control(){
	}

	public void initial(){
		PC = new ProgramCounter(7);
		GPRs = new General_Purpose_Registers();
		IR = new Instruction_Register();
		IXR = new Index_Registers(7, 100, 1000);
		MAR = new Memory_Address_Register();
		MBR = new Memory_Buffer_Register();
		MFR.resetMFR();
		Mem = new Memory(2048,7);
		Mem.writeMem(1, 6);
	}

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

	public void Load(){
		int EA = 0;
		if (IR.getindirect() == 0) {
			if (IR.getindexregister() == 0) {
				EA = IR.getaddress();
			}
			else if (IR.getindexregister() > 0 && IR.getindexregister() < 4) {
				EA = IXR.getregister(IR.getindexregister()) + IR.getaddress();
			}
		}
		else if (IR.getindirect() == 1) {
			if (IR.getindexregister() == 0) {
				MAR.setMemaddress(IR.getaddress());
				MBR.setData(Mem.readMem(MAR.getMemaddress()));
				EA = MBR.getData();
			}
			else if (IR.getindexregister() > 0 && IR.getindexregister() < 4) {
				MAR.setMemaddress(IR.getaddress());
				MBR.setData(Mem.readMem(MAR.getMemaddress()));
				EA = IXR.getregister(IR.getindexregister()) + MBR.getData();
			}
		}
		
		MAR.setMemaddress(EA);
		MBR.setData(Mem.readMem(MAR.getMemaddress()));
		GPRs.setregister(IR.getregister(), MBR.getData());
	}

	public void Store(){
		int EA = 0;
		
		if (IR.getindirect() == 0) {
			if (IR.getindexregister() == 0) {
				EA = IR.getaddress();
			}
			else if (IR.getindexregister() > 0 && IR.getindexregister() < 4) {
				EA = IXR.getregister(IR.getindexregister()) + IR.getaddress();
			}
		}
		else if (IR.getindirect() == 1) {
			if (IR.getindexregister() == 0) {
				MAR.setMemaddress(IR.getaddress());
				MBR.setData(Mem.readMem(MAR.getMemaddress()));
				EA = MBR.getData();
			}
			else if (IR.getindexregister() > 0 && IR.getindexregister() < 4) {
				MAR.setMemaddress(IR.getaddress());
				MBR.setData(Mem.readMem(MAR.getMemaddress()));
				EA = IXR.getregister(IR.getindexregister()) + MBR.getData();
			}
		}
		
		MAR.setMemaddress(EA);
		MBR.setData(GPRs.getregister(IR.getregister()));
		Mem.writeMem(MAR.getMemaddress(), MBR.getData());
	}
}