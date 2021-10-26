package com.company.template_pattern;

/**
 * 创建一个抽象类，它的模板方法被设置为 final。
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 14:45
 */
public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	/**
	 * 模板方法，不允许被之类重写，
	 * 只能被子类调用，play主要流程进行哪些操作已被模板方法固定，
	 * 子类只能自定义流程里的方法的具体行为，而不能改变流程调用的方法
	 */
	public final void play() {

		//初始化游戏
		initialize();

		//开始游戏
		startPlay();

		//结束游戏
		endPlay();
	}
}