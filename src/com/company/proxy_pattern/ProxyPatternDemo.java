package com.company.proxy_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/26 11:05
 * https://www.runoob.com/design-pattern/proxy-pattern.html
 * 使用场景：按职责来划分，通常有以下使用场景： 1、远程代理。 2、虚拟代理。 3、Copy-on-Write 代理。 4、保护（Protect or Access）代理。 5、Cache代理。 6、防火墙（Firewall）代理。 7、同步化（Synchronization）代理。 8、智能引用（Smart Reference）代理。
 * <p>
 * 注意事项： 1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。 2、和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println();
		// 图像不需要从磁盘加载
		image.display();
	}
}
