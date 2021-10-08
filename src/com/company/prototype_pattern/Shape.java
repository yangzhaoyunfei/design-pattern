package com.company.prototype_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/10/8 12:28
 */
public abstract class Shape implements Cloneable {

	protected String type;
	private String id;

	abstract void draw();

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}