package practicePrograms;

public class Factorial {

	public static void main(String[] args) {

		
		int number = 5;
		int fact =1;
		
		for (int i=0; i<=number; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial for" + " " + number + " " + "is " + fact );
	}

}
