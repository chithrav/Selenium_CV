package week1.assignments;

import java.util.Iterator;

public class FibanocciSeries {

	public static void main(String[] args) {

		int firstNum=0;
		int secNum=1;
		int sum;
		int input =8;
		
		System.out.println("Fibannocci Series for the given input is:");
		System.out.println(firstNum);
		
		for( int i=1; i<input; i++) {
			
			sum=firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
			
						
			System.out.println(sum);
			
		}
			
		
	}

}

