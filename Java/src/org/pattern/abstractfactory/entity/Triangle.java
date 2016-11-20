package org.pattern.abstractfactory.entity;

public class Triangle implements Shape {

	@Override
	public String description() {
		StringBuilder description = new StringBuilder();
		description.append("\nFigure: Triangle");
		description.append("\nCount of sides: 3\n");
		
		return description.toString();
	}

}
