package fr.thieol.sshutils.example;

import java.io.IOException;

import fr.thieol.sshutils.core.SshProperties;

public class Example {

	public static void main(String[] args) throws IOException {
	final SshProperties properties = SshProperties.builder()
				.host("192.168.0.10")
				.user("olivier")
				.password("olivier").build();
		
/*
		TomcatExecutor executor = new TomcatExecutor(properties);
		String home = executor.pwd();
		home = executor.pwd();
		if ( Arrays.asList(executor.ls().split("\n")).contains("temp")) {
			System.out.println("removing directory temp in " + home);
			executor.rmdir("temp");
		};
		System.out.println("creating directory temp in " + home);
		executor.mkdir("temp");

		executor.close();
*/
	}

}
