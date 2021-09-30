package com.company.abstract_factory_pattern.factory;

/**
 * @author tang.zhong.wei
 * @date 2021/9/30 17:14
 */
public class FactoryProducer {
	/**
	 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
	 *
	 * @param choice
	 * @return
	 */
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}