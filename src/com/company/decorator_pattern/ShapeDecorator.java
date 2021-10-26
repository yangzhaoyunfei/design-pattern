package com.company.decorator_pattern;

/**
 * 实现了 Shape 接口的抽象装饰类
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 18:07
 */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		decoratedShape.draw();
	}
}