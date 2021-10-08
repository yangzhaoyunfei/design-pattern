package com.company.builder_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 11:56
 */
public interface Item {
	String name();

	Packing packing();

	float price();
}
