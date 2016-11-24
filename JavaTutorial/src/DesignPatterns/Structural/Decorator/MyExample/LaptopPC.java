package DesignPatterns.Structural.Decorator.MyExample;

public class LaptopPC extends ComputerDecorator {

	public LaptopPC(Computer c) {
		super(c);
	}
	public void getComputer() {
		super.getComputer();
		System.out.println("Laptop bilgisayar Uretildi");		
	}

	

}
