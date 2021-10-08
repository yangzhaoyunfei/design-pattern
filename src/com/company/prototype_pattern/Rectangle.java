package com.company.prototype_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 12:29
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
