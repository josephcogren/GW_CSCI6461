package components;

public class Index_Registers{
	int[] registers = {0, 0, 0};

	public Index_Registers(){
	}

	public Index_Registers(int register1, int register2, int register3){
		if (register1 < Math.pow(2, 12) && register1 >= 0)
			registers[0] = register1;
		if (register2 < Math.pow(2, 12) && register2 >= 0)
			registers[1] = register2;
		if (register3 < Math.pow(2, 12) && register3 >= 0)
			registers[2] = register3;
	}

	public int getregister(int index){
		if (index >= 0 && index < 3)
			return registers[index];
		else
			return -1;
	}
}