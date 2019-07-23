package behavioral.strategy;

public class Main {

	public static void main(String[] args) {

		
//		WhiteDuck wd= new WhiteDuck();
//		wd.performEat();
//		wd.performFly();
//		wd.setEatBehavior(new EatNothing());
//		wd.performEat();
		
		RubberDuck rd= new RubberDuck();
		rd.performEat();
		rd.performFly();
	//	rd.flyBehavior= new FlyJet();
		//rd.performFly();
	}

}
