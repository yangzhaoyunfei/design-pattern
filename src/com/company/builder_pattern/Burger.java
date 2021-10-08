package com.company.builder_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 11:57
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
