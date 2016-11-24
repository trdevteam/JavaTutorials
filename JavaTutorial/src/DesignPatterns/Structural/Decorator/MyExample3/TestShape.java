package DesignPatterns.Structural.Decorator.MyExample3;

public class TestShape {
	public static void main(String[] args) {
		
		Circle c = new Circle(new Rectangle(new Line(new DefaultShape())));
		
		c.draw();
		
		
	}
}
