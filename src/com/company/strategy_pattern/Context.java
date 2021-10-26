package com.company.strategy_pattern;

/**
 * Context 是一个使用了某种策略的类。
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 13:48
 */
public class Context {
	private final Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
