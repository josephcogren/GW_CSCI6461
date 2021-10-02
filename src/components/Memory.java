package components;

public class Memory{
	// sets the initial conditions for the memory
	private int[] Memwords = new int[2048];
	private int start = 0;

	public Memory(){
	}

	public Memory(int size, int start){
		// determines if new words directory is needed, else it sets start to itself
		if (size >= 2048 && size <= 4096){
			Memwords = new int[size];
		}
		if (start >= 0 && start < size){
			this.start = start;
		}
	}

	public int readMem(int address){
		//determines if the memory address is acceptable or not, else throws and error
		if (address >= start && address < Memwords.length)
			return Memwords[address];
		else
			return -1;
	}

	public boolean writeMem(int address, int newData){
		// writes to memory if the address is within the acceptable range and if the new data is within the limits of our bit-limits
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