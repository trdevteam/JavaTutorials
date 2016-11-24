package DesignPatterns.Structural.Proxy;

public class TestProxyPattern {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "J@urnalD$vXXX");
		try {
//			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}