package structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private CommandExecutor commandExecutor;
	private boolean admin;

	public CommandExecutorProxy(String user) {
		if (user.equals("admin")) {
			admin = true;
			commandExecutor = new CommandExecutorImpl();
		}
	}

	@Override
	public void runCommand() {
		if (admin) {
			commandExecutor.runCommand();
		}

	}

}
