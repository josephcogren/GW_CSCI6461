package components;

public class ProgramCounter {
	private int PCaddress = 0;

	public ProgramCounter(){
	}

	public ProgramCounter(int PCaddress){
		if (PCaddress < Math.pow(2,12) && PCaddress >= 0){
			this.PCaddress = PCaddress;
		}
	}

	public void PCPlus(){
		PCaddress++;
	}

	public int getPCaddress(){
		return PCaddress;
	}

	public boolean setPCaddress(int newaddress){
		if (newaddress < Math.pow(2,12) && newaddress >= 0){
			PCaddress = newaddress;
			return true;
		}
		else
			return false;
	}
}
