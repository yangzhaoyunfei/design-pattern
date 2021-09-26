package com.company.factory_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/9/26 10:01
 */
public class Laptop implements Product {

	@Override
	public void make() {
		System.out.println("Inside PgsqlDriver::make() method.");
	}
}
