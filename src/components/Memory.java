package components;

public class Memory{
	private int[] Memwords = new int[2048];
	private int start = 0;

	public Memory(){
	}

	public Memory(int size, int start){
		if (size >= 2048 && size <= 4096){
			Memwords = new int[size];
		}
		if (start >= 0 && start < size){
			this.start = start;
		}
	}

	public int readMem(int address){
		if (address >= start && address < Memwords.length)
			return Memwords[address];
		else
			return -1;
	}

	public boolean writeMem(int address, int newData){
		if (address >= start && address < Memwords.length){
			if (newData >= 0 && newData < Math.pow(2, 16)){
				Memwords[address] = newData;
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
}