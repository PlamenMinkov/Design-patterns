package org.pattern.factory.entity;

public abstract class Person 
{
	protected String firstName;
	protected String lastName;
	
	public void setFirstName(String name)
	{
		this.firstName = name;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String name)
	{
		this.lastName = name;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
}
