package com.company.factory_pattern_advance;

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
	public Product getProduct(ProductTypeEnum type) {
		try {
			//创建产品实例
			return (Product) Class.forName(type.getName()).getConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
