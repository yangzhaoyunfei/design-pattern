package com.company.strategy_pattern;

/**
 * 实体策略类
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 13:46
 */
public class OperationSubtract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}
