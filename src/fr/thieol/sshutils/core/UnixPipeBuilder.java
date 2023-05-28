package fr.thieol.sshutils.core;

public class UnixPipeBuilder {

	public static final String SPACE = " ";
	
	public static String build(
			final String ... commands) {
		return String.join(SPACE + "|" + SPACE, commands);  

	}

}
