package fr.thieol.sshutils.core;

import java.util.ArrayList;
import java.util.List;

public class UnixCommand {

	private String command;
	private List<String> options = new ArrayList<>();
	private List<String> parameters = new ArrayList<>();

	public void setCommand(String command)  {
		this.command = command;
	}

	public void setOptions(final List<String> options)  {
		this.options.addAll(options);
	}

	public void setParameters(final List<String> parameters)  {
		this.parameters = parameters;
	}
	
	
}
