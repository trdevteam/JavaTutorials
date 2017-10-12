package DesignPatterns.Structural.Decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		errors.put("Lux", "Lux hata");
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
	
}