package DesignPatterns.Structural.Decorator;

public class BasicCar implements Car {

	@Override
	public void assemble() {
		errors.put("Basic", "Normal");
		System.out.print("Basic Car.");
	}

}