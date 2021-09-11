package com.company.nullobj;

public class CustomerFactory {

	public static final String[] names = {"Rob", "Joe", "Julie"};

	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		//没有时 返回空对象
		return new NullCustomer();
	}
}