package com.company.factory_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/9/26 10:02
 */
public class Headphone implements Product {

	@Override
	public void make() {
		System.out.println("Inside MysqlDriver::make() method.");
	}
}
