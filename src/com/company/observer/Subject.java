package com.company.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 被观察者
 */
public class Subject {

	/**
	 * 关键代码：维护一个观测者集合。
	 */
	private final List<Observer> observers
			= new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}

	/**
	 * 改变状态
	 *
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
		//被观察者变化时, 主动通知所有观察者.
		notifyAllObservers();
	}

	//添加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 通知所有观察者, 就是调用他们的方法
	 */
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}