package creational.abstractFactory;

public class RectangleFactory implements AbstractFactory {

	@Override
	public Shape getshape() {
		return new Rectangle();
	}

}
