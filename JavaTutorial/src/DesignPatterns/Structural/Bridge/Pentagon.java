package DesignPatterns.Structural.Bridge;

public class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}

	@Override
	public void draw() {
		System.out.println("Drawing a pentagon");		
	} 

}