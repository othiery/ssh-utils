package fr.thieol.sshutils.core;

public enum UnixCommand {
	
	PWD("pwd"),
	RM("rm"),
	LS("ls");
	
	private String command;
	
	UnixCommand(String command) {
		this.command = command;
	}
	
	String getCommand() {
		return command;
	}
}
