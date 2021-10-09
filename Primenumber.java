package week1.assignments;

public class Primenumber {

	public static void main(String[] args) {

		int input = 17;
		boolean isPrime = false;
		int remainder;
		for (int i=2; i<=input/2; i++) {
			
			remainder = input%i;
			if (remainder == 0) {
				
				isPrime = true;
				break;
				
			}
		}
			if(isPrime==true)
				System.out.println(input + " is not a prime number");
			else
				System.out.println(input + " is  a prime number");
			
		

}
}
