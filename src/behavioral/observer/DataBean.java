package behavioral.observer;

public class DataBean {

	private String temp;
	private String humidity;
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	@Override
	public String toString() {
		return "DataBean [temp=" + temp + ", humidity=" + humidity + "]";
	}
	
	
}
