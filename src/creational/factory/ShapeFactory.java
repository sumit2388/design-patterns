package creational.factory;

public class ShapeFactory {

	public static Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("square")) {
			return new Sqaure();
		}
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		return null;
	}
}
