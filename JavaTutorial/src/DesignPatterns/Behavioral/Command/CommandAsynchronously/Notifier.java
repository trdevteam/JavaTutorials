package DesignPatterns.Behavioral.Command.CommandAsynchronously;

import java.util.ArrayList;
import java.util.List;

public class Notifier {

	
	List<Receiver> liste = new ArrayList<Receiver>();
	
	public void add(Receiver c) {
		liste.add(c);
	}
	
	public void notifyReceiver() {
		
		for(Receiver c:liste) {
			
			Thread t = new Thread(c);
			t.start();
			
		}
		
		liste.clear();
		
	}
	
}
