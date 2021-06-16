package DesignPatterns.Structural.Decorator;

public class LuxCar extends CarDecorator{

	public LuxCar(Car c) {
		super(c);
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("LuxCar");
	}

}
