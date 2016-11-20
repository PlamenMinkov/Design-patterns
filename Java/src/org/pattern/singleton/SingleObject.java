package org.pattern.singleton;

import java.util.concurrent.ThreadLocalRandom;

public class SingleObject 
{
	private static SingleObject instance = new SingleObject();
	
	private SingleObject() 
	{
		//
	}
	
	public static SingleObject getInstance()
	{
		return instance;
	}
	
	public int getRandomInteger(int min, int max)
	{
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}

}
