package DesignPatterns.Structural.Bridge;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.draw();
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.draw();
		pent.applyColor();
	}

}