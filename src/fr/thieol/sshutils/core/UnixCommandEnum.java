package fr.thieol.sshutils.core;

public enum UnixCommandEnum {
	
	CP("cp"),
	ECHO("echo"),
	GREP("grep"),
	LS("ls"),
	MKDIR("mkdir"),
	PWD("pwd"),
	PS("ps"),
	RM("rm"),
	SUDO("sudo");
	
	private String command;
	
	UnixCommandEnum(String command) {
		this.command = command;
	}
	
	String getCommand() {
		return command;
	}
}
