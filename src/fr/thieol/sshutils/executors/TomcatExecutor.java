package fr.thieol.sshutils.executors;

import java.io.IOException;

import fr.thieol.sshutils.core.Executor;
import fr.thieol.sshutils.core.SshProperties;

public class TomcatExecutor extends Executor {

	public  TomcatExecutor(SshProperties properties) throws IOException {
		super(properties);
	}

	public String getTomcatStatus() throws IOException {
		String result = execute("systemctl list-unit-files --type service -all | grep tomcat9.service");
		return result;
	
	}
	
	public boolean isTomcatRunning() throws IOException {
		 String result = execute("ps aux | grep tomcat9");
		 if ( result.length() > 0 ) return true;
		 return false;
	}

	
	public void stopTomcat(String password) throws IOException {
		 execute("echo " + password + " | sudo -S systemctl stop tomcat9.service");

		
	}

	public void startTomcat(String password) throws IOException {
		 execute("echo " + password + " | sudo -S systemctl start tomcat9.service");

		
	}
	
	public String deployWar() throws IOException {
		return execute("cp ./deployments/installer.war /var/lib/tomcat9/webapps/installer");
	}
	
	

	public void close() throws IOException {
		super.close();
	}

}


