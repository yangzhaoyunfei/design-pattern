package com.company.abstract_factory_pattern.factory;

import com.company.abstract_factory_pattern.color.Color;
import com.company.abstract_factory_pattern.shape.Circle;
import com.company.abstract_factory_pattern.shape.Rectangle;
import com.company.abstract_factory_pattern.shape.Shape;
import com.company.abstract_factory_pattern.shape.Square;

/**
 * @author tang.zhong.wei
 * @date 2021/9/30 17:09
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}