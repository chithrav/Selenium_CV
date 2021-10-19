package week3.assignments;

public class StringReplace {

	public static void main(String[] args) {
		String str = "I am working with Java8";
		String newStr = str.replace("8","11");
		System.out.println("New String is: "+ newStr);
		
		newStr = newStr + "#";
		
		System.out.println(newStr);
				
		System.out.println("Sub string of I am working with Java11# is: " + newStr.substring(5, 14));

	}

}
