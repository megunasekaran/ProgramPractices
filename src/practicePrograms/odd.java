package practicePrograms;

import java.util.Scanner;

public class odd {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int a = 0; a <= 2; a++) {
			System.out.println("enter a number");
			int n = sc.nextInt();


			if (n % 2 == 0) {
				System.out.println(n + "is an even number");
			} else {
				System.out.println(n + "is a odd number");

			}
		}
		
		System.out.println("user not allowed");


	}

}
