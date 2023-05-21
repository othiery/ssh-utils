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
		return execute(UnixCommand.PWD.getCommand());
	}

	public String ls() throws IOException {
		return execute(UnixCommand.LS.getCommand());
	}

	public String mkdir(String dir) throws IOException {
		return execute("mkdir " + dir);
	}

	public String rmdir(String dir) throws IOException {
		return execute(UnixCommand.RM.getCommand()  + " -r " + dir);
	}

	public void close() throws IOException {
		sshClient.close();
	}

}


