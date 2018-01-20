package DesignPatterns.Behavioral.Command.CommandAsynchronously;

public class ReceiverA extends Receiver{

	@Override
	public void run() {
		
		execute();
		
	}

	@Override
	public void execute() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Updated A");		
	}

}
