package fr.thieol.sshutils.core;

public enum UnixOptionEnum {
	

	RECURSIVE("recursive"),
	SHELL("shell");
	
	private String option;
	
	UnixOptionEnum(String option) {
		this.option = option;
	}
	
	String getOption() {
		return option;
	}
}
