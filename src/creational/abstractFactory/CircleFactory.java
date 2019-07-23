package creational.abstractFactory;

public class CircleFactory implements AbstractFactory{

	@Override
	public Shape getshape() {
		return  new Circle();
	}

}
