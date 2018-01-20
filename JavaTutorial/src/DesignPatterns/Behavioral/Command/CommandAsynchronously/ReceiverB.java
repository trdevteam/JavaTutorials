package DesignPatterns.Behavioral.Command.CommandAsynchronously;

public class ReceiverB extends Receiver{

	@Override
	public void run() {		
		execute();
	}

	@Override
	public void execute() {
		System.out.println("Updated B");
	}

}
