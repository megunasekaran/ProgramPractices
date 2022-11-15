package practicePrograms;

public class SwapTwoNumbers {

	public static void main(String args[]) {

		int a = 5;
		int b = 6;

		System.out.println("Before Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a + b; // a=11
		b = a - b; // b=5
		a = a - b; // a = 6

		System.out.println("After Swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
