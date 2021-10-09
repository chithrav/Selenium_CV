package week1.assignments;

public class AmstrongNumber {

	public static void main(String[] args) {

		int input = 370; 
		int number = 0;
		int modValue;
		int total = 0;
		
		 number=input;
		while(number!=0) {
			
			modValue=number%10;
			total= total+(modValue*modValue*modValue);
			number=number/10;
			
			
		}
		
		if(total==number) 
			System.out.println("The given number is Amstrong Number");
		
		else 
			System.out.println("The given number is not an Amstrong Number");
			
		
	}

}
