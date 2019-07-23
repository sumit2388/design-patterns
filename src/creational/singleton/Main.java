package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {

		Singleton obj = Singleton.getInstance();
		System.out.println(obj.hashCode());
		
	//	Singleton ob = (Singleton) obj.clone();     //  cloning singleton obj
	//	System.out.println(ob.hashCode());
		
//		Singleton refInstance = null;
//		Class<Singleton> clazz = Singleton.class;
//		Constructor[] con = Singleton.class.getDeclaredConstructors();
//		for(Constructor c : con){
//			c.setAccessible(true);
//			 refInstance = (Singleton) c.newInstance();
//		}
//		System.out.println(refInstance.hashCode());
		
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton"));
		out.writeObject(obj);
		out.close();
		
		ObjectInput in = new ObjectInputStream( new FileInputStream("singleton"));
		Singleton ser = (Singleton) in.readObject();
		in.close();
		
		System.out.println(ser.hashCode());
		
				
	}

}
