package behavioral.strategy;

public class EatNothing implements EatBehavior {

	@Override
	public void eating() {
		System.out.println("Eat Nothing");		
	}

}
