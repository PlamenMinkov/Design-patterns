package org.pattern.abstractfactory;

import org.pattern.abstractfactory.service.AbstractFactory;
import org.pattern.abstractfactory.service.FactoryProducer;

public class AbstarctFactoryTest {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		
		AbstractFactory shapeFactory = factoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = factoryProducer.getFactory("COLOR");
		
		System.out.println(shapeFactory.getShape("triangle").description());
		System.out.println(colorFactory.getColor("red").fill());

	}

}
