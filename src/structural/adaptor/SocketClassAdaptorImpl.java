package structural.adaptor;

public class SocketClassAdaptorImpl extends Socket implements SocketAdaptor{

	@Override
	public Volt get12Volt() {
		Volt v = getVolts();
		return convert(v, 20);
	}

	@Override
	public Volt get120Volt() {
		Volt v = getVolts();
		return convert(v, 2);
	}

	@Override
	public Volt get240Volt() {
		return getVolts();
	}

	private Volt convert(Volt v,int i){
		return new Volt(v.getVolt()/i);
	} 
}
