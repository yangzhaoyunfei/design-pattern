package com.company.abstract_factory_pattern.color;

/**
 * @author tang.zhong.wei
 * @date 2021/9/30 16:58
 */
public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}