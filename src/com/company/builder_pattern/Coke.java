package com.company.builder_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 12:00
 */
public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}
