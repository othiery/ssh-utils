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
				UnixCommandFormatter.build(UnixCommandEnum.PWD));
	}

	public String ls() throws IOException {
		return execute(
				UnixCommandFormatter.build(UnixCommandEnum.LS));
	}

	public String mkdir(String dir) throws IOException {
		return execute(
				UnixCommandFormatter.build(
						UnixCommandEnum.MKDIR, dir));
	}

	public String rmdir(String dir) throws IOException {
		return execute(
				UnixCommandFormatter.build(
						UnixCommandEnum.RM, 
						UnixOptionEnum.RECURSIVE,
						dir));
	}
	
	public String cp(String source, String destination) throws IOException {
		return execute(
				UnixCommandFormatter.build(
						UnixCommandEnum.CP, 
						source,
						destination));
	}


	public void close() throws IOException {
		sshClient.close();
	}

}


