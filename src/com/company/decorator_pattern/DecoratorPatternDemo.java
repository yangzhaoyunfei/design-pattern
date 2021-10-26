package com.company.decorator_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/26 18:09
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
//使用 RedShapeDecorator 来装饰 Shape 对象。
		Shape circle = new Circle();
		ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		//Shape redCircle = new RedShapeDecorator(new Circle());
		//Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
