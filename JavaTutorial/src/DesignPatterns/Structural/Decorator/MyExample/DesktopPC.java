package DesignPatterns.Structural.Decorator.MyExample;

public class DesktopPC extends ComputerDecorator{

	public DesktopPC(Computer c) {
		super(c);
	}
	
	public void getComputer() {
		super.getComputer();
		System.out.println("masaustu bilgisayar Uretildi");		
	}

	

}
