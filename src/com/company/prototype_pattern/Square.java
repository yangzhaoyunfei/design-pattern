package com.company.prototype_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 12:29
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
