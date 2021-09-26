package com.company.factory_pattern_advance;

/**
 * 现支持的产品类型枚举
 *
 * @author tang.zhong.wei
 * @date 2021/9/26 10:57
 */
public enum ProductTypeEnum {
	Laptop("Laptop", Laptop.class.getName()),
	Telephone("Telephone", Telephone.class.getName()),
	Headphone("Headphone", Headphone.class.getName());
	private final String simpleName;
	private final String name;

	ProductTypeEnum(String simpleName, String name) {
		this.simpleName = simpleName;
		this.name = name;
	}

	/**
	 * 获通过简易名获取全限定名
	 *
	 * @param simpleName
	 * @return
	 */
	public static String getName(String simpleName) {
		for (ProductTypeEnum animalEnum : ProductTypeEnum.values()) {
			if (animalEnum.getSimpleName().equalsIgnoreCase(simpleName)) {
				return animalEnum.getName();
			}
		}
		return null;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public String getName() {
		return name;
	}
}
