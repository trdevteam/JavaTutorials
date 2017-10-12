package DesignPatterns.Structural.Decorator;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();

		System.out.println("");
		for(String s : sportsLuxuryCar.errors.values()) {
			System.out.println(s);
		}
		
	}

}