package structural.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	
	@Override
	public int read() throws IOException {
		int read = in.read();
		return read==-1?read:Character.toUpperCase(read);
	}

	
}
