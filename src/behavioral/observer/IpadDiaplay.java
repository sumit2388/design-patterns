package behavioral.observer;

public class IpadDiaplay implements Observer {
	private Observable observable;
	
	public IpadDiaplay(Observable ob) {
		this.observable=ob;
		observable.register(this);
	}

	@Override
	public void update(DataBean dataBean) {
		System.out.println("Ipad display "+dataBean.toString());
		
	}

}
