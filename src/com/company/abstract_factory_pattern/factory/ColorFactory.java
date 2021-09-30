package com.company.abstract_factory_pattern.factory;

import com.company.abstract_factory_pattern.color.Blue;
import com.company.abstract_factory_pattern.color.Color;
import com.company.abstract_factory_pattern.color.Green;
import com.company.abstract_factory_pattern.color.Red;
import com.company.abstract_factory_pattern.shape.Shape;

/**
 * @author tang.zhong.wei
 * @date 2021/9/30 17:14
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}