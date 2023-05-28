package fr.thieol.sshutils.core;

public class UnixCommandBuilder {

	public static final String SPACE = " ";
	public static final String DOUBLE_DASH = "--";
	
	public static String build(
			final UnixCommandEnum unixCommandEnum,
			final UnixOptionEnum unixOptionEnum,
			final String argument) {
	
		return unixCommandEnum.getCommand() + SPACE + 
				DOUBLE_DASH + unixOptionEnum.getOption() + SPACE +
				argument;
		
	}
	
	public static String build(
			final UnixCommandEnum unixCommandEnum,
			final UnixOptionEnum unixOptionEnum
			) {
	
		return unixCommandEnum.getCommand() + " --" + 
				unixOptionEnum.getOption();
		
	}


	public static String build(
			final UnixCommandEnum unixCommandEnum,
			final String argument) {
	
		return unixCommandEnum.getCommand() + " " + 
							argument;
		
	}

	public static String build(
			final UnixCommandEnum unixCommandEnum,
			final String argument1, 
			final String argument2) {
	
		return unixCommandEnum.getCommand() + " " + 
							argument1 + " " + argument2;
		
	}

	public static String build(
			final UnixCommandEnum unixCommandEnum) {
	
		return unixCommandEnum.getCommand() ;
	}

}
