package com.company.flyweight_pattern;

import java.util.HashMap;

/**
 * @author tang.zhong.wei
 * @date 2021/11/10 10:15
 */
public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
