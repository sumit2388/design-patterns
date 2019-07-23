package structural.proxy;

public class Main {

	public static void main(String[] args) {

		CommandExecutorProxy proxy = new CommandExecutorProxy("admin");
		proxy.runCommand();
		
	}

}
