package com.company.delegate_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/26 11:35
 * https://www.jianshu.com/p/38acf37b1e1f
 * https://www.cnblogs.com/walkinhalo/p/9603932.html
 * https://zhuanlan.zhihu.com/p/55541492
 */
public class DelegatePatternDemo {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.doing("注册");
		leader.doing("登录");
	}
}
