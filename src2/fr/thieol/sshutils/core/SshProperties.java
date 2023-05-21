package fr.thieol.sshutils.core;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.With;

@Getter @Setter @Builder
public class SshProperties {

	@With private String host;
	@With private String user;
	@With private String password;
	
}
