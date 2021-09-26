package com.company.factory_pattern_plugin.pgsql;

import com.company.factory_pattern_plugin.Product;

/**
 * pgsql对约定jdbc的实现
 *
 * @author tang.zhong.wei
 * @date 2021/9/26 10:01
 */
public class PgsqlDriver implements Product {

	@Override
	public void make() {
		System.out.println("Inside PgsqlDriver::make() method.");
	}
}
