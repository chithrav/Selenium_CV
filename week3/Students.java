package org.student;

public class Students {
	
	public void getStudentInfo(int stuId) {
		System.out.println("Student ID is " + stuId);
	}
	
	public void getStudentInfo(int stuId, String Name) {
		System.out.println("Student ID is " + stuId + " and " + " Student name is " + Name);
	}
	
	public void getStudentInfo(String email, int PhoneNum) {
		System.out.println("Student email is " + email + " and " + " Student mobile number is " + PhoneNum);
	}

	public static void main(String[] args) {
		 
		Students obj =new Students();
		obj.getStudentInfo(1024);
		obj.getStudentInfo(1024, "Chithra");
		obj.getStudentInfo("Chithra@gmail.com", 234567890);
	}

}
