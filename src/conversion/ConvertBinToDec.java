package conversion;

public class ConvertBinToDec {
	public static int convertbintodec(String bin_number) {
		int decimal=Integer.parseInt(bin_number,2);
		return decimal;
	}  
	public static void main(String args[]) {
		System.out.println(Integer.parseInt("1010",2));
	}
}
