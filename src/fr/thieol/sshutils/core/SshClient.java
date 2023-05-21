package fr.thieol.sshutils.core;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.connection.channel.direct.Session.Command;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;

public class SshClient {

	private SSHClient sshClient;
	private SshProperties properties;


	public SshClient(SshProperties properties) {
		this.properties = properties;
	}

	public void connect() throws IOException {
		sshClient = new SSHClient();
		sshClient.addHostKeyVerifier(new PromiscuousVerifier());
		sshClient.connect(properties.getHost());
		sshClient.authPassword(properties.getUser(), properties.getPassword());
	}

	public String execute(String command, long timeout) throws IOException {
		Session session = null;
		session = sshClient.startSession();
		final Command cmd = session.exec(command);
		String result = IOUtils.readFully(cmd.getInputStream()).toString();
		cmd.join(timeout, TimeUnit.SECONDS);
		if (session != null) 
			session.close();

		if ( cmd.getExitStatus() == 0 ) return result;
		throw new RuntimeException("Exit status is " + cmd.getExitStatus() + " for command " + command);

	}

	public void close() throws IOException {
		sshClient.disconnect();
		sshClient.close();
	}
}
