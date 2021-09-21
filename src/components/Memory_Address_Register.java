package components;

public class Memory_Address_Register{
	private int Memaddress = 0;

	public Memory_Address_Register(){
	}

	public int getMemaddress(){
		return Memaddress;
	}

	public boolean setMemaddress(int newaddress){
		if (newaddress < Math.pow(2,12) && newaddress >= 0){
			Memaddress = newaddress;
			return true;
		}
		else
			return false;
	}
}