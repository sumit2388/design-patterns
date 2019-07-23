package structural.decorator1;

public class Main {

	public static void main(String[] args) {
				Car sportscar= new SportsCar(new BasicCar());
				sportscar.assemble();
				System.out.println("----");				
				Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
				sportsLuxuryCar.assemble();
	}

}
