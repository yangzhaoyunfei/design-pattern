package com.company.delegate_pattern;

/**
 * 员工类去实现抽象任务类,可以做任务
 */
public class EmployeeA implements Working {
	@Override
	public void doing(String content) {
		System.out.println("员工A做" + content);
	}
}