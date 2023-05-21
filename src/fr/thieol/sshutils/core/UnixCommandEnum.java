package fr.thieol.sshutils.core;

public enum UnixCommandEnum {
	
	MKDIR("mkdir"),
	PWD("pwd"),
	RM("rm"),
	LS("ls");
	
	private String command;
	
	UnixCommandEnum(String command) {
		this.command = command;
	}
	
	String getCommand() {
		return command;
	}
}
