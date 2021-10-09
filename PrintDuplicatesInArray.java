package week1.day2.assignments;

import java.util.Iterator;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
				// declare an int variable named count
				
				// iterate from 0 to the array length-1 (outer loop starts here)
				
					// assign 0 to count 
					
					// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
					
							// compare both the loop variables & check they're equal
						
									// increase the count if both the arrays are equal
							
					// Out of the inner loop, check and print the first array variable if count is more than 0
		
		int length = array.length;
		System.out.println("Length of the array is " + length);
		
		int count;
		for (int i = 0; i < array.length; i++) 
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println("Duplicate enties in the given array is " + array[i]);
					
					
				} 
				
			}
			
		}
	}

