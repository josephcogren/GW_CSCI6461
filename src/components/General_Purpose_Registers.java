package components;

public class General_Purpose_Registers{
	private int[] registers = {0, 0, 0, 0};

	public General_Purpose_Registers(){
	}

	public int getregister(int index){
		if (index >= 0 && index < 4)
			return registers[index];
		else
			return -1;
	}

	public boolean setregister(int index, int newvalue){
		if (index >= 0 && index < 4){
			if (newvalue < Math.pow(2, 16) && newvalue >= 0){
				registers[index] = newvalue;
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
}