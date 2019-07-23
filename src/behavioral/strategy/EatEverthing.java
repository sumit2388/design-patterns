package behavioral.strategy;

public class EatEverthing  implements EatBehavior{

	@Override
	public void eating() {
		System.out.println("Eat everything");		
	}

}
