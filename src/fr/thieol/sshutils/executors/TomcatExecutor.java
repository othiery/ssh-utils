package fr.thieol.sshutils.executors;

import java.io.IOException;

import fr.thieol.sshutils.core.Executor;
import fr.thieol.sshutils.core.SshProperties;
import fr.thieol.sshutils.core.UnixCommandBuilder;
import fr.thieol.sshutils.core.UnixCommandEnum;
import fr.thieol.sshutils.core.UnixPipeBuilder;
import fr.thieol.sshutils.core.UnixSudoCommandBuilder;

public class TomcatExecutor extends Executor {

	public  TomcatExecutor(SshProperties properties) throws IOException {
		super(properties);
	}

	public String getTomcatStatus() throws IOException {
		String result = execute(
				UnixPipeBuilder.build(
						"systemctl list-unit-files --type service -all", 
						UnixCommandBuilder.build(
								UnixCommandEnum.GREP,  "tomcat9.service")));
		return result;
	
	}
	
	public boolean isTomcatRunning() throws IOException {
		 String result = execute(
				 UnixPipeBuilder.build(
						 UnixCommandBuilder.build(
									UnixCommandEnum.PS,  "aux"), 
						 UnixCommandBuilder.build(
									UnixCommandEnum.GREP,  "tomcat9"))); 

		 if ( result.length() > 0 ) return true;
		 return false;
	}

	
	public void stopTomcat(String password) throws IOException {
		 execute(
				 UnixPipeBuilder.build(
						 UnixCommandBuilder.build(
									UnixCommandEnum.ECHO,  password), 
						 "sudo -S systemctl stop tomcat9.service"));

		
	}

	public void startTomcat(String password) throws IOException {
		 execute(
				 UnixPipeBuilder.build(
					UnixCommandBuilder.build(
						 UnixCommandEnum.ECHO,  password),  
					UnixSudoCommandBuilder.build("systemctl start tomcat9.service")));

		
	}
	
	public String deployWar() throws IOException {
		return super.cp(
				"./deployments/installer.war", 
				"/var/lib/tomcat9/webapps/installer");
	}
	
	

	public void close() throws IOException {
		super.close();
	}

}


