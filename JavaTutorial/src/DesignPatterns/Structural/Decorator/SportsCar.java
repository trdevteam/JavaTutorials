package DesignPatterns.Structural.Decorator;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		
		errors.put("Sports", "hataYok");
		
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
	
}