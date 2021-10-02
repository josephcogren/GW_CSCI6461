package components;

// This class control all the components' object and can decode the instruction and execute them

import java.io.*;
import conversion.*;

public class CPU_Control{
	// all the components including Memory
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
// This sets the initial components of the machine (initial or restart)
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
		
		// read IPX.txt and load it to the memory
		try {
			String pathname = "IPL.txt";
			File IPL = new File(pathname);
			InputStreamReader reader = new InputStreamReader(new FileInputStream(IPL));
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while (line != null) {
				line  = br.readLine();
				if (line == null) break;
				String[] loadtoMem = line.split(" ");
				Mem.writeMem(ConvertHexToDec.convertHexToDec(loadtoMem[0]), ConvertHexToDec.convertHexToDec(loadtoMem[1]));
			}
			br.close();
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}
	
// This command is for post-Project #1 to run a single cycle of our machine simulator.
	public void runsinglestep(){
		// set the MAR according to the PC
		MAR.setMemaddress(PC.getPCaddress());
		// PC += 1
		PC.PCPlus();
		// get the instruction from the Memory to MBR
		MBR.setData(Mem.readMem(MAR.getMemaddress()));
		// set the instruction to IR from MBR
		IR.setinstruction(MBR.getData());
		// decode and get the opcode and then execute instruction accordingly
		switch(IR.getopcode()){
			case 1:
				Load();
				break;
			case 2:
				Store();
				break;
		}
	}
	
// This acts as the load instruction
	public void Load(){
		int EA = 0;
		// checks for an IR indirect in each register and computing the correct EA
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
		// set the correct EA to the MAR
		MAR.setMemaddress(EA);
		// read the Memory and fetch the data to the MBR
		MBR.setData(Mem.readMem(MAR.getMemaddress()));
		// load the data in MBR to the target register
		GPRs.setregister(IR.getregister(), MBR.getData());
	}
	
// 
	public void Store(){
		int EA = 0;
		// checks for an IR indirect in each register and computing the correct EA
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
		// set the correct EA to the MAR
		MAR.setMemaddress(EA);
		// get the data from GPRs to MBR
		MBR.setData(GPRs.getregister(IR.getregister()));
		// write the data in MBR to the Memory with the address of MAR
		Mem.writeMem(MAR.getMemaddress(), MBR.getData());
	}
}