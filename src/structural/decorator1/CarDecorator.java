package structural.decorator1;

public abstract class CarDecorator  implements Car{

	public Car car;
	
	public CarDecorator(Car c ) {
		this.car=c;
	}
	
	@Override
	public void assemble() {
			this.car.assemble();
	}
}
