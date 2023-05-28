package fr.thieol.sshutils.core;

public enum UnixCommandEnum {
	
	CP("cp"),
	ECHO("echo"),
	GREP("grep"),
	LS("ls"),
	MKDIR("mkdir"),
	PWD("pwd"),
	PS("ps"),
	RMDIR("rm"),
	RM("rm"),
	SUDO("sudo"),
	WHO("who")	;
	
	private String command;
	
	UnixCommandEnum(String command) {
		this.command = command;
	}
	
	String getCommand() {
		return command;
	}
}
