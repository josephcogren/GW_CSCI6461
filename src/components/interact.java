package components;

// this is the class that GUI can use and all the components are in the object CPU

import conversion.ConvertBinToDec;
import conversion.ConvertDecToBin;

public class interact {
	public CPU_Control CPU = new CPU_Control();
	
	public interact() {
		CPU.initial();
	}
	
	public void IPL_button() {
		CPU.initial();
	}
	
	public void SS_button() {
		CPU.runsinglestep();
	}
	
	// if the opcode is correct which is 000001
	public void Load_button(String InputofBin) {
		int Input = ConvertBinToDec.convertbintodec(InputofBin);
		CPU.IR.setinstruction(Input);
		CPU.runsinglestep();
	}
	
	// if the opcode is correct which is 000002
	public void Store_button(String InputofBin) {
		int Input = ConvertBinToDec.convertbintodec(InputofBin);
		CPU.IR.setinstruction(Input);
		CPU.runsinglestep();
	}
	
	// LD_button can change the value of each components according to the order of the GUI
	public boolean LD_button(String InputofBin, int index) {
		int Input = ConvertBinToDec.convertbintodec(InputofBin);
		switch (index) {
		case 1:
			return CPU.GPRs.setregister(0, Input);
		case 2:
			return CPU.GPRs.setregister(1, Input);
		case 3:
			return CPU.GPRs.setregister(2, Input);
		case 4:
			return CPU.GPRs.setregister(3, Input);
		case 5:
			return CPU.IXR.setregister(1, Input);
		case 6:
			return CPU.IXR.setregister(2, Input);
		case 7:
			return CPU.IXR.setregister(3, Input);
		case 8:
			return CPU.PC.setPCaddress(Input);
		case 9:
			return CPU.MAR.setMemaddress(Input);
		case 10:
			return CPU.MBR.setData(Input);
		}
		return false;
	}
	
	// This function can return the value of each components according to the order of the GUI
	public String get_number(int index) {
		switch (index) {
		case 1: 
			return ConvertDecToBin.convertDecToBin(CPU.GPRs.getregister(0));
		case 2:
			return ConvertDecToBin.convertDecToBin(CPU.GPRs.getregister(1));
		case 3:
			return ConvertDecToBin.convertDecToBin(CPU.GPRs.getregister(2));
		case 4:
			return ConvertDecToBin.convertDecToBin(CPU.GPRs.getregister(3));
		case 5:
			return ConvertDecToBin.convertDecToBin(CPU.IXR.getregister(1));
		case 6:
			return ConvertDecToBin.convertDecToBin(CPU.IXR.getregister(2));
		case 7:
			return ConvertDecToBin.convertDecToBin(CPU.IXR.getregister(3));
		case 8:
			return ConvertDecToBin.convertDecToBin(CPU.PC.getPCaddress());
		case 9:
			return ConvertDecToBin.convertDecToBin(CPU.MAR.getMemaddress());
		case 10:
			return ConvertDecToBin.convertDecToBin(CPU.MBR.getData());
		case 11:
			return ConvertDecToBin.convertDecToBin(CPU.IR.getinstruction());
		}
		return "";
	}
}
