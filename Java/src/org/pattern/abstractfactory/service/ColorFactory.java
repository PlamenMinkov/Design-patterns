package org.pattern.abstractfactory.service;

import org.pattern.abstractfactory.entity.Color;
import org.pattern.abstractfactory.entity.Green;
import org.pattern.abstractfactory.entity.Red;
import org.pattern.abstractfactory.entity.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	public	Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public	Color getColor(String color) {
		switch (color) {
		case "red":
			return new Red();
		case "green":
			return new Green();
			
		default:
			return null;
		}		
	}

}
