package org.pattern.abstractfactory.service;

import org.pattern.abstractfactory.entity.Color;
import org.pattern.abstractfactory.entity.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType);
	public abstract Color getColor(String color);
}
