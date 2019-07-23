package structural.decorator;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {

		int c;
		InputStream i = new LowerCaseInputStream(new BufferedInputStream(System.in));
		try {
			while((c=i.read())>0){
				System.out.println((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
