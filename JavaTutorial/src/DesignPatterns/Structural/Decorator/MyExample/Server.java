package DesignPatterns.Structural.Decorator.MyExample;

public class Server extends ComputerDecorator{

	public Server(Computer c) {
		super(c);
	}

	public void getComputer(){
		super.getComputer();
		System.out.println("Sunucu bilgisayar uretildi");
	}
	
}
