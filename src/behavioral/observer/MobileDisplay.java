package behavioral.observer;

public class MobileDisplay implements Observer{
	
	private Observable observable;
	
	public MobileDisplay(Observable ob) {
		this.observable=ob;
		observable.register(this);
	}

	
	@Override
	public void update(DataBean dataBean) {
		System.out.println("MobileDisplay "+dataBean.toString());
		
	}

}
