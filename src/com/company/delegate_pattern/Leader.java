package com.company.delegate_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 任务分配者
 */
public class Leader implements Working {
	private final Map<String, Working> map = new HashMap<>();

	public Leader() {
		map.put("登录", new EmployeeA());
		map.put("注册", new EmployeeB());
	}

	@Override
	public void doing(String content) {
		map.get(content).doing(content);
	}

}