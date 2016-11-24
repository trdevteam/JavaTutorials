package DesignPatterns.Structural.Decorator.MyExample3;

public class Rectangle extends ShapeDecorator{
	
	public Rectangle(Shape s) {
		super(s);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("Dikdortgen");
	}
}
