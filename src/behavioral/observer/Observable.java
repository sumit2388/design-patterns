package behavioral.observer;

public interface Observable {
	
	public void register(Observer ob);
	public void remove(Observer ob);
	public void notifyObserver();

}
