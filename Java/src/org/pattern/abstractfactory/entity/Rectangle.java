package org.pattern.abstractfactory.entity;

public class Rectangle implements Shape {

	@Override
	public String description() {
		StringBuilder description = new StringBuilder();
		description.append("\nFigure: Rectangle");
		description.append("\nCount of sides: 4\n");
		
		return description.toString();
	}

}
