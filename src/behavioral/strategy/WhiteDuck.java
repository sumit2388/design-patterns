package behavioral.strategy;

public class WhiteDuck extends Duck{

	public WhiteDuck() {
		flyBehavior=new FlyJet();
		eatBehavior= new EatEverthing();
	}
}
