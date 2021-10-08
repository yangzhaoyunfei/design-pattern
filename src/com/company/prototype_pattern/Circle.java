package com.company.prototype_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 12:29
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
