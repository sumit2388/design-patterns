package creational.factory;

public class Main {

	public static void main(String[] args) {

		Shape sq = ShapeFactory.getShape("square");
		Shape c = ShapeFactory.getShape("circle");
		sq.draw();
		c.draw();
	}

}
