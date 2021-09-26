package com.company.factory_pattern_plugin.oracle;

import com.company.factory_pattern_plugin.Product;

/**
 * Oracle对约定jdbc的实现
 *
 * @author tang.zhong.wei
 * @date 2021/9/26 10:00
 */
public class OracleDriver implements Product {

	@Override
	public void make() {
		System.out.println("Inside OracleDriver::make() method.");
	}
}