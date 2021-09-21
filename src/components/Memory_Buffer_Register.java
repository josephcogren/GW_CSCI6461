package components;

public class Memory_Buffer_Register{
	private int Data = 0;

	public Memory_Buffer_Register(){
	}

	public int getData(){
		return Data;
	}

	public boolean setData(int newData){
		if (newData < Math.pow(2,12) && newData >= 0){
			Data = newData;
			return true;
		}
		else
			return false;
	}
}