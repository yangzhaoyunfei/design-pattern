package com.company.strategy_pattern;

/**
 * 演示类使用 Context 和策略对象来演示 Context 在它所配置或使用的策略改变时的行为变化
 * https://www.runoob.com/design-pattern/strategy-pattern.html
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 13:50
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
