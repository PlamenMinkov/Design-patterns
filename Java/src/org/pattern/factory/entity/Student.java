package org.pattern.factory.entity;

public class Student extends Person
{
	private String studentClass;
	
	public Student() 
	{
		//
	}
	
	public Student(String firstName, String lastName, String studentClass) 
	{
		setFirstName(firstName);
		setLastName(lastName);
		setStudentClass(studentClass);
	}

	public String getStudentClass() 
	{
		return studentClass;
	}

	public void setStudentClass(String studentClass) 
	{
		this.studentClass = studentClass;
	}
	
	@Override
	public String toString() {
		StringBuilder studentData = new StringBuilder();
		
		studentData.append("\nStudent\n");
		studentData.append("First and last name: " + this.firstName + " " + this.lastName + "\n");
		studentData.append("Class: " + this.studentClass);
		
	    return studentData.toString();
	} 
}
