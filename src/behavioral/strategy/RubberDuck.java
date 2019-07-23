package behavioral.strategy;

public class RubberDuck  extends Duck{

	public RubberDuck() {
		eatBehavior=new EatNothing();
	//	flyBehavior=new FlyJet();
	}
}
