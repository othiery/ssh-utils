package fr.thieol.sshutils.core;

public enum UnixOptionEnum {
	
	RECURSIVE("recursive");
	
	private String option;
	
	UnixOptionEnum(String option) {
		this.option = option;
	}
	
	String getOption() {
		return option;
	}
}
