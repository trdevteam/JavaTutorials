package DesignPatterns.Behavioral.State;

public class TestTVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State s1 = new TVStartState();
		State s2 = new TVStopState();
		
		context.setState(s1);
		context.doAction();	
		
		context.setState(s2);
		context.doAction();
		
	}

}