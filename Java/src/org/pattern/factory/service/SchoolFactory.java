package org.pattern.factory.service;

import org.pattern.factory.entity.Person;
import org.pattern.factory.entity.Student;
import org.pattern.factory.entity.Teacher;

public class SchoolFactory 
{
	public Person getPerson(String type, String firstName, String lastName, String classOrSubject)
	{
		switch (type) {
		case "student":
			return new Student(firstName, lastName, classOrSubject);
		case "teacher": 
			return new Teacher(firstName, lastName, classOrSubject);

		default: return null;
		}
	}
}
