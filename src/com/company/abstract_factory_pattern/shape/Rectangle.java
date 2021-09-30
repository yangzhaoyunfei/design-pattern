package com.company.abstract_factory_pattern.shape;

/**
 * @author tang.zhong.wei
 * @date 2021/9/30 16:55
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
