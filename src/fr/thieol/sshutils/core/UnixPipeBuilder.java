package fr.thieol.sshutils.core;

public class UnixPipeBuilder {

	public static String build(
			final String ... commands) {
		return String.join(" | ", commands);  

	}

}
