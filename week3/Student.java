package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name is Chithra");
	}
	
	public void studentDept() {
		System.out.println("Student Department is ECE");
	}
	
	public void studentId() {
		System.out.println("Student ID is 11007106016");
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
