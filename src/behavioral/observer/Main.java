package behavioral.observer;

public class Main {

	public static void main(String[] args) {

		WeatherStation ws = new WeatherStation();
		MobileDisplay md = new MobileDisplay(ws);
		TVDisplay td = new TVDisplay(ws);
		IpadDiaplay id= new IpadDiaplay(ws);
		ws.updateWeatherData("10", "45");
		ws.remove(td);
		ws.updateWeatherData("11", "55");
		
	}

}
