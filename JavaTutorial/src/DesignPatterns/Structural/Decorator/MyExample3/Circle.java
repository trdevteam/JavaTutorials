package DesignPatterns.Structural.Decorator.MyExample3;

public class Circle extends ShapeDecorator{
	
	public Circle(Shape s) {
		super(s);
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("Cember");
	}

}
