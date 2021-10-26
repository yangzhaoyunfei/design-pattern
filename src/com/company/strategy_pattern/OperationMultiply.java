package com.company.strategy_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/26 13:48
 */
public class OperationMultiply implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}