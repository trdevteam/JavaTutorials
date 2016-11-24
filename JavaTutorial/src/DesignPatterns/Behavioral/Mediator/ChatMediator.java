package DesignPatterns.Behavioral.Mediator;

public interface ChatMediator {

	public void sendMessage(String msg, User user);

	void addUser(User user);
	
}