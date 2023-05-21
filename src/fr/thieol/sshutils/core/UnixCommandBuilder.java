package fr.thieol.sshutils.core;

public class UnixCommandBuilder {

	public static String build(
			final UnixCommandEnum unixCommandEnum,
			final UnixOptionEnum unixOptionEnum,
			final String argument) {
	
		return unixCommandEnum.getCommand() + " " + 
			"--" + unixOptionEnum.getOption() + " " +
				argument;
		
	}

	public static String build(
			final UnixCommandEnum unixCommandEnum,
			final String argument) {
	
		return unixCommandEnum.getCommand() + " " + 
							argument;
		
	}

	public static String build(
			final UnixCommandEnum unixCommandEnum) {
	
		return unixCommandEnum.getCommand() ;
	}

}
