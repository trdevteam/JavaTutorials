package DesignPatterns.Creational.Factory;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "8GB", "500GB", "2.6Ghz");
		Computer server = ComputerFactory.getComputer("Server", "64GB", "5000GB", "5.6Ghz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);;
	}
}
