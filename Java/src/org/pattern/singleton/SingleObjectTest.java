package org.pattern.singleton;

public class SingleObjectTest {

	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getInstance();

		System.out.println(singleObject.getRandomInteger(10, 100));
	}

}
