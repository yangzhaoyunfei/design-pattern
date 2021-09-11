package com.company.observer;

/**
 * 观察者模式有很多其他的称谓，理解这些术语对以后理解别人的博客十分重要。发布-订阅(Publish/Subscribe)模式：发布者维护订阅者列表，发布消息模型-视图(Model/View)模式：模型维护视图对象，数据发生改变时通知视图源-监听器(Source/Listener)模式：事件源维护监听器列表，当事件源触发事件后，监听器接收事件对象(由事件源负责创建)，并且可以回调事件的方法从属者(Dependents)模式：回调方法：在A调B方法中，把A传入B方法。
 * <p>
 * 作者：黄杰
 * 链接：https://zhuanlan.zhihu.com/p/141069636
 * 来源：知乎
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
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
