package com.company.observer;

/**
 * 抽象观察者
 */
public abstract class Observer {
	//被观察对象
	protected Subject subject;

	//被观察对象变化时,要采取的行动
	public abstract void update();
}