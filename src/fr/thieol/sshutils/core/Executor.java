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
		return execute(
				UnixCommandBuilder.build(UnixCommandEnum.PWD));
	}

	public String ls() throws IOException {
		return execute(
				UnixCommandBuilder.build(UnixCommandEnum.LS));
	}

	public String mkdir(String dir) throws IOException {
		return execute(
				UnixCommandBuilder.build(
						UnixCommandEnum.MKDIR, dir));
	}

	public String rmdir(String dir) throws IOException {
		return execute(
				UnixCommandBuilder.build(
						UnixCommandEnum.RM, 
						UnixOptionEnum.RECURSIVE,
						dir);
	}

	public void close() throws IOException {
		sshClient.close();
	}

}


