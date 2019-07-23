package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

	List<Observer> obList = new ArrayList<>();
	private DataBean dataBean = new DataBean();
	
	

	@Override
	public void register(Observer ob) {
		obList.add(ob);
	}

	@Override
	public void remove(Observer ob) {
		obList.remove(ob);
	}

	@Override
	public void notifyObserver() {
		
		for( Observer o : obList){
			o.update(dataBean);
		}
	}
	
	public void updateWeatherData(String temp,String hum){
		dataBean.setTemp(temp);
		dataBean.setHumidity(hum);
		notifyObserver();
	}

}
