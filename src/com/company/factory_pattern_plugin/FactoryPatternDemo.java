package com.company.factory_pattern_plugin;

/**
 * https://www.runoob.com/design-pattern/factory-pattern.html
 * 一、一句话概括工厂模式
 * <p>
 * 简单工厂：一个工厂类，一个产品抽象类。
 * 工厂方法：多个工厂类，一个产品抽象类。
 * 抽象工厂：多个工厂类，多个产品抽象类。
 * 二、生活中的工厂模式
 * <p>
 * 简单工厂类：一个麦当劳店，可以生产多种汉堡。
 * 工厂方法类：一个麦当劳店，可以生产多种汉堡。一个肯德基店，也可以生产多种汉堡。
 * 抽象工厂类：百胜餐饮集团下有肯德基和百事公司，肯德基生产汉堡，百事公司生成百事可乐。
 *
 * @author tang.zhong.wei
 * @date 2021/9/26 10:04
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		Factory factory = new Factory();

		//获取 MysqlDriver 的对象，并调用它的 draw 方法
		Product product1 = factory.getProduct("CIRCLE");

		//调用 MysqlDriver 的 draw 方法
		product1.make();

		//获取 OracleDriver 的对象，并调用它的 draw 方法
		Product product2 = factory.getProduct("RECTANGLE");

		//调用 OracleDriver 的 draw 方法
		product2.make();

		//获取 PgsqlDriver 的对象，并调用它的 draw 方法
		Product product3 = factory.getProduct("SQUARE");

		//调用 PgsqlDriver 的 draw 方法
		product3.make();
	}
}
