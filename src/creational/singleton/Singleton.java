package creational.singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	private static Singleton singleton;

	private Singleton() {
		if (singleton != null) {
			throw new IllegalStateException("refelection blocked");
		}
		
		System.setSecurityManager(new SecurityManager()); 

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("clone blocked");
	}

	protected Object readResolve() {
		return singleton;
	}

}
