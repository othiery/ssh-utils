package fr.thieol.sshutils.core;

import java.io.IOException;

public class Executor {

	private SshClient sshClient;

	protected  Executor(SshProperties properties) throws IOException {
		sshClient = new SshClient(properties);
		sshClient.connect();
	}

	public String execute(String command) throws IOException {
		return sshClient.execute(command, Long.MAX_VALUE);

	}

	public String pwd() throws IOException {
		return execute(UnixCommandEnum.PWD.getCommand());
	}

	public String ls() throws IOException {
		return execute(UnixCommandEnum.LS.getCommand());
	}

	public String mkdir(String dir) throws IOException {
		return execute(UnixCommandEnum.MKDIR.getCommand() + " " + dir);
	}

	public String rmdir(String dir) throws IOException {
		return execute(UnixCommandEnum.RM.getCommand()  + " -r " + dir);
	}

	public void close() throws IOException {
		sshClient.close();
	}

}


