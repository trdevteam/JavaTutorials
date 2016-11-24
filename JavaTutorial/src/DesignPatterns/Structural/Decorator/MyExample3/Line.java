package DesignPatterns.Structural.Decorator.MyExample3;

public class Line extends ShapeDecorator{
	
	public Line(Shape s) {
		super(s);
	}

	@Override
	public void draw() {
		s.draw();
		System.out.println("Cizgi");		
	}

}
