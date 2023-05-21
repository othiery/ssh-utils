package fr.thieol.sshutils.core;

public enum UnixOption {
	
	RECURSIVE("recursive");
	
	private String option;
	
	UnixOption(String option) {
		this.option = option;
	}
	
	String getOption() {
		return option;
	}
}
