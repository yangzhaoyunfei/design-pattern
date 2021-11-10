package com.company.flyweight_pattern;

/**
 * 享元模式
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * https://www.runoob.com/design-pattern/flyweight-pattern.html
 * 在享元模式中可以共享的相同内容称为 内部状态(Intrinsic State)，而那些需要外部环境来设置的不能共享的内容称为 外部状态(Extrinsic State)，其中外部状态和内部状态是相互独立的，外部状态的变化不会引起内部状态的变化。由于区分了内部状态和外部状态，因此可以通过设置不同的外部状态使得相同的对象可以具有一些不同的特征，而相同的内部状态是可以共享的。也就是说，享元模式的本质是分离与共享 ： 分离变与不变，并且共享不变。把一个对象的状态分成内部状态和外部状态，内部状态即是不变的，外部状态是变化的；然后通过共享不变的部分，达到减少对象数量并节约内存的目的。
 * <p>
 * 　　在享元模式中通常会出现工厂模式，需要创建一个享元工厂来负责维护一个享元池(Flyweight Pool)（用于存储具有相同内部状态的享元对象）。在享元模式中，共享的是享元对象的内部状态，外部状态需要通过环境来设置。在实际使用中，能够共享的内部状态是有限的，因此享元对象一般都设计为较小的对象，它所包含的内部状态较少，这种对象也称为 细粒度对象。
 * 享元模式的目的就是使用共享技术来实现大量细粒度对象的复用。
 * ————————————————
 * 版权声明：本文为CSDN博主「书呆子Rico」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/justloveyou_/article/details/55045638
 *
 * @author tang.zhong.wei
 * @date 2021/11/10 10:16
 */
public class FlyweightPatternDemo {
	private static final String[] colors =
			{"Red", "Green", "Blue", "White", "Black"};

	public static void main(String[] args) {

		/**
		 * note 这里是线性操作，并且使用完就丢弃，所以没有线程安全的问题，要是由并发操作的，享元模式可能不支持并发操作的。
		 */
		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
