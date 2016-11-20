package org.pattern.abstractfactory.service;

import org.pattern.abstractfactory.entity.Color;
import org.pattern.abstractfactory.entity.Rectangle;
import org.pattern.abstractfactory.entity.Shape;
import org.pattern.abstractfactory.entity.Triangle;

public class ShapeFactory extends AbstractFactory{

	@Override
	public	Shape getShape(String shapeType) {
		switch (shapeType) {
		case "triangle":
			return new Triangle();
		case "rectangle":
			return new Rectangle();
			
		default:
			return null;
		}		
		
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
