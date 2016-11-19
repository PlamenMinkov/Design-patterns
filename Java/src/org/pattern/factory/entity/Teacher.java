package org.pattern.factory.entity;

public class Teacher extends Person
{
	private String subject;
	
	public Teacher() 
	{
		//
	}
	
	public Teacher(String firstName, String lastName, String studentClass) 
	{
		setFirstName(firstName);
		setLastName(lastName);
		setStudentClass(studentClass);
	}

	public String getStudentClass() 
	{
		return subject;
	}

	public void setStudentClass(String subject) 
	{
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		StringBuilder studentData = new StringBuilder();
		
		studentData.append("\nTeacher\n");
		studentData.append("First and last name: " + this.firstName + " " + this.lastName + "\n");
		studentData.append("Subject: " + this.subject);
		
	    return studentData.toString();
	} 
}
