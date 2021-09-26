package com.company.observer;

/**
 * 抽象观察者(观察者应该具有的统一模板)
 */
public abstract class Observer {
	/**
	 * 被观察对象
	 */
	protected Subject subject;

	/**
	 * 被观察者变化时,观察者要采取的行动
	 */
	public abstract void update();
}