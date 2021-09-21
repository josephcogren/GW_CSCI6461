package components;

public class Test {
	public static void main(String args[]) {
		CPU_Control Test = new CPU_Control();
		Test.initial();
		Test.Mem.writeMem(7, 0b0000010001000000);
		Test.runsinglestep();
		System.out.println(Test.GPRs.getregister(0));
	}
}
