package behavioral.observer;

public class TVDisplay implements Observer{
	
	private Observable observable;

	public TVDisplay(Observable ob) {
		this.observable=ob;
		observable.register(this);
	}

	@Override
	public void update(DataBean dataBean) {
		System.out.println("TVDisplay "+dataBean.toString());
		
	}

}
