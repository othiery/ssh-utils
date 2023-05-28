package fr.thieol.sshutils.core;

public class UnixSudoCommandBuilder {

	public static String build(
			final UnixCommandEnum unixCommandEnum,
			final UnixOptionEnum unixOptionEnum,
			final String argument) {
	
		return UnixCommandFormatter.build(UnixCommandEnum.SUDO, 
				UnixOptionEnum.SHELL) + " " + 
				UnixCommandFormatter.build(unixCommandEnum, 
						unixOptionEnum, argument);
		
	}
	

	public static String build(
			final String command) {
	
		return UnixCommandFormatter.build(UnixCommandEnum.SUDO, 
				UnixOptionEnum.SHELL) + " " + 
				command;
		
	}

}
