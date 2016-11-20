package org.pattern.abstractfactory.service;

public class FactoryProducer 
{
	public AbstractFactory getFactory(String type)
	{
		switch (type) {
			case "COLOR":
				return new ColorFactory();
			case "SHAPE":
				return new ShapeFactory();

			default:
				return null;
		}
	}
}
