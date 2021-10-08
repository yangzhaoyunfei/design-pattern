package com.company.prototype_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 12:31
 */
public class PrototypePatternDemo {
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
}
