package com.company.decorator_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/26 18:06
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}