package components;

public class Machine_Fault_Register {
	private int Faultindex = -1;
	
	public Machine_Fault_Register() {
	}
	
	public int getFault() {
		return Faultindex;
	}
	
	public boolean setFault(int Faultindex) {
		if (Faultindex >= 0 && Faultindex < 4) {
			this.Faultindex = Faultindex;
			return true;
		}
		else 
			return false;
	}
	
	public void resetMFR() {
		Faultindex = 0;
	}
}
