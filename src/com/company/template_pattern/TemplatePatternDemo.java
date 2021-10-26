package com.company.template_pattern;

/**
 * https://www.w3cschool.cn/shejimoshi/template-pattern.html
 *
 * @author tang.zhong.wei
 * @date 2021/10/26 14:48
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
