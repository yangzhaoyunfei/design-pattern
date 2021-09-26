package com.company.factory_pattern_plugin;

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

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
		try {
			//创建Properties对象
			Properties properties = new Properties();
			//类加载器读取配置文件
			InputStream is = Factory.class.getClassLoader().getResourceAsStream("./product.properties");
			properties.load(is);
			is.close();
			//通过Entry遍历<迭代Entry>
			for (Map.Entry<Object, Object> entry : properties.entrySet()) {
				//动态创建实现类对象,只要在配置文件中的类，都会创建并运行
				Product goods = (Product) Class.forName((String) entry.getValue()).getConstructor().newInstance();
				//接口回调(可选)
				goods.make();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
