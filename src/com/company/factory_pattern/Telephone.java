package com.company.factory_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/9/26 10:00
 */
public class Telephone implements Product {

	@Override
	public void make() {
		System.out.println("Inside OracleDriver::make() method.");
	}
}