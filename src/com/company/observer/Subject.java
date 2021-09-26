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
	private final List<Observer> observers = new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}

	/**
	 * 被观察者改变状态
	 *
	 * @param state
	 */
	public void setState(int state) {
		this.state = state;
		//被观察者变化时, 主动通知所有观察者.
		notifyAllObservers();
	}

	/**
	 * 添加观察者
	 *
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 通知所有观察者,调用他们的方法
	 * 即调用观察者的更新方法, 通知他们更新自己.
	 * 这里是直接本地调用, 其实还可以通过消息队列来解耦做到间接调用
	 */
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}