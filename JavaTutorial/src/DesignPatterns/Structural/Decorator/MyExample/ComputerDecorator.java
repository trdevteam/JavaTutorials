package DesignPatterns.Structural.Decorator.MyExample;

public class ComputerDecorator implements Computer{

	protected Computer c;
	
	@Override
	public void getComputer() {
		c.getComputer();
	}
	
	public ComputerDecorator(Computer c) {
		this.c = c;
	}

}
