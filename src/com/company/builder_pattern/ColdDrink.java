package com.company.builder_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 11:57
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
