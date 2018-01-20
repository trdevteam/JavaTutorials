package DesignPatterns.Behavioral.Command.CommandAsynchronously;

public class Test {

	public static void main(String[] args) {
		
		Notifier n = new Notifier();
		Receiver c1 = new ReceiverA();
		Receiver c2 = new ReceiverB();
		n.add(c1);
		n.add(c2);		
		n.notifyReceiver();
		
	}
	
}
