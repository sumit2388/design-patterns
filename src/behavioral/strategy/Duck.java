package behavioral.strategy;

public abstract class Duck {

	public EatBehavior eatBehavior;
	public FlyBehavior flyBehavior;
	
	public void performFly(){
		flyBehavior.flying();
	}
	
	public void performEat(){
		eatBehavior.eating();
	}
	
	public void setFlyBehavior(FlyBehavior fb){
		this.flyBehavior=fb;
	}
	
	public void setEatBehavior(EatBehavior eb){
		this.eatBehavior=eb;
	}
}
