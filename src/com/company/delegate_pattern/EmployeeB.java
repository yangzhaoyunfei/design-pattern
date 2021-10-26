package com.company.delegate_pattern;

/**
 * 具体实现类B
 */
public class EmployeeB implements Working {
	@Override
	public void doing(String content) {
		System.out.println("员工B做" + content);
	}
}
