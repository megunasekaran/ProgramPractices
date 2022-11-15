package practicePrograms;

public class PrimeNumbers {
	
	// number should be divisible by 1 and the number itself

	public static void main(String[] args) {
		
		int num = 9;
		
		int count=0;
		
		if(num>1) {
			
			for(int i=1; i<=num;i++) {
				
				if(num%i==0) {
					count++;
				}
				
			}
			
			if(count==2)
			{
				System.out.println("Number is Prime");
			}
			else {
				System.out.println("Not a prime number");

			}
			
			
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
