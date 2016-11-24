package DesignPatterns.Structural.Decorator.MyExample;

public class Test {
	public static void main(String[] args) {
		
		LaptopPC laptop = new LaptopPC(new PC());
		laptop.getComputer();
		
		PC pc = new PC();
		pc.getComputer();
		
		System.out.println("---");
		DesktopPC desktop = new DesktopPC(new LaptopPC(new PC()));		
		desktop.getComputer();
		
		System.out.println("---");
		Server server = new Server(new SystemPC());
		server.getComputer();
		
	}
}
