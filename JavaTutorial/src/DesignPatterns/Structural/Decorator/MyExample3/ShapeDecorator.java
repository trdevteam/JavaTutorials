package DesignPatterns.Structural.Decorator.MyExample3;

public class ShapeDecorator implements Shape{
	
	protected Shape s;
	public ShapeDecorator(Shape s) {
		this.s=s;
	}
	@Override
	public void draw() {
		s.draw();		
	}
	
	
}
