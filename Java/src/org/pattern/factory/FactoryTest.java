package org.pattern.factory;

import org.pattern.factory.entity.Person;
import org.pattern.factory.service.SchoolFactory;

public class FactoryTest {

	public static void main(String[] args) {
		SchoolFactory factory = new SchoolFactory();
		
		Person student = factory.getPerson("student", "Ivan", "Petkanov", "12a");
		System.out.println(student);
		
		Person teacher = factory.getPerson("teacher", "Stefka", "Petrova", "Mathematics");
		System.out.println(teacher);
	}

}
