package creational.abstractFactory;

public class Main {

	public static void main(String[] args) {

		Shape cir = ShapeFactory.getFactory(new CircleFactory());
		cir.draw();
		Shape rec = ShapeFactory.getFactory(new RectangleFactory());
		rec.draw();
	}

}
