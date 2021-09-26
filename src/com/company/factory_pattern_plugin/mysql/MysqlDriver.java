package com.company.factory_pattern_plugin.mysql;

import com.company.factory_pattern_plugin.Product;

/**
 * mysql对约定jdbc的实现
 *
 * @author tang.zhong.wei
 * @date 2021/9/26 10:02
 */
public class MysqlDriver implements Product {

	@Override
	public void make() {
		System.out.println("Inside MysqlDriver::make() method.");
	}
}
