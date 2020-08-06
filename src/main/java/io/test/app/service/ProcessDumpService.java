package io.test.app.service;

import java.util.List;
import java.util.Map;

public class ProcessDumpService {

	private List<String> processes = null;
	
	public ProcessDumpService(List<String> _processes) {
		this.processes = _processes;
	}
	
	public Map<String, String> getProcessDump(){
		ProcessBuilder pb = new ProcessBuilder();
		
		for(String processName: processes) {
			pb.command("ps -ef|grep "+processName);
			try {
				pb.start();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	
}
