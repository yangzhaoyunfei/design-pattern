package com.company.abstract_factory_pattern.factory;

import com.company.abstract_factory_pattern.color.Color;
import com.company.abstract_factory_pattern.shape.Shape;

/**
 * @author tang.zhong.wei
 * @date 2021/9/30 17:09
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}