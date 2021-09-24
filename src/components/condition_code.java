package components;

public class condition_code {
	private int OVERFLOW = 0;
	private int UNDERFLOW = 0;
	private int DIVZERO = 0;
	private int EQUALORNOT = 0;
	
	public void OVERFLOW() {
		OVERFLOW = 1;
	}
	
	public void UNDERFLOW() {
		UNDERFLOW = 1;
	}
	
	public void DIVZERO() {
		DIVZERO = 1;
	}
	
	public void EQUALORNOT() {
		EQUALORNOT = 1;
	}
	
	public void resetCC() {
		OVERFLOW = 0;
		UNDERFLOW = 0;
		DIVZERO = 0;
		EQUALORNOT = 0;
	}
}
