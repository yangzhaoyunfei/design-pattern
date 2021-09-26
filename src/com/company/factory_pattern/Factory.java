package com.company.factory_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/9/26 10:03
 */
public class Factory {

	/**
	 * 向工厂传递信息,以获得需要的产品类型
	 *
	 * @param type 产品类型
	 * @return 生产的产品
	 */
	public Product getProduct(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Headphone();
		} else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Telephone();
		} else if (type.equalsIgnoreCase("SQUARE")) {
			return new Laptop();
		}
		return null;
	}
}
