package com.company.builder_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 12:00
 */
public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}