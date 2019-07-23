package structural.adaptor;

// this design pattern is used when we have two unrealted interface or objects can work together. 
public class Socket {

	public Volt getVolts(){
		return new Volt(240);
	}
}
