package structural.adaptor;

public class SocketObjectAdaptorImpl implements SocketAdaptor {

	private Socket socket = new Socket();
	
	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolts();
		
		return convert(v, 20); 
	}

	@Override
	public Volt get120Volt() {
		Volt v = socket.getVolts();
		return convert(v, 2); 
	}

	@Override
	public Volt get240Volt() {
		return socket.getVolts();
	}
	
	private Volt convert(Volt v,int i){
		return new Volt(v.getVolt()/i);
	} 

}
