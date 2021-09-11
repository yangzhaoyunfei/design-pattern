package com.company.observer;

/**
 * Description: 观察者模式--使用 Subject 和实体观察者对象。
 * <p>
 * 主动通知是由被观察自己通知观察者的.在其他框架中, 可能是使用了其他机制来实现通知观察者.
 * <p>
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * <p>
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * <p>
 * 何时使用：一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。
 * <p>
 * 如何解决：使用面向对象技术，可以将这种依赖关系弱化。
 * <p>
 * 关键代码：在抽象类里有一个 ArrayList 存放观察者们。
 * <p>
 * 应用实例： 1、拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。 2、西游记里面悟空请求菩萨降服红孩儿，菩萨洒了一地水招来一个老乌龟，这个乌龟就是观察者，他观察菩萨洒水这个动作。
 *
 * @author yangzhaoyunfei yangzhaoyunfei@qq.com
 * @date 2019/7/2 0002
 * @see <a href="https://www.w3cschool.cn/shejimoshi/observer-pattern.html">参考链接</a>
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		//被观察者
		Subject subject = new Subject();

		//多个观察者
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		//被观察者发生改变
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
