package com.company.builder_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 11:59
 */
public class VegBurger extends Burger {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}
}
