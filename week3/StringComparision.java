package week3.assignments;

public class StringComparision {

	public static void main(String[] args) {
		String str1="I am Learning Java" ;
		String str2="I am learning java"; 
		
		if(str1==str2) {
			System.out.println("both string references are equal");
		}
		else if (str1.equals(str2)) {
			System.out.println("String1 eqauls String2");
		}
		else if (str1.equalsIgnoreCase(str2)) {
			System.out.println("String1 equalsIgnoreCase String2");
		}
		
		
	}

}
