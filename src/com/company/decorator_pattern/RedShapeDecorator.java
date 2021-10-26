package com.company.decorator_pattern;

/**
 * 扩展了 ShapeDecorator 类的实体装饰类
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 18:08
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		//装饰方法，扩展功能
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}
