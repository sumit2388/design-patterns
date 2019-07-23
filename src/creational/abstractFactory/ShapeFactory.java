package creational.abstractFactory;

public class ShapeFactory {

	public static Shape getFactory(AbstractFactory factory){
		return factory.getshape();
	}
}
