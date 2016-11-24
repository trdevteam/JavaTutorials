package DesignPatterns.Structural.Composite;

import java.util.ArrayList;

public class Drawing implements Shape{

	//collection of Shapes
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void draw(String fillColor) {
		for(Shape sh : shapes)
		{
			sh.draw(fillColor);
		}
	}
	
	public Shape getChild(int index) {
		return shapes.get(index);	
	}
	
	//adding shape to drawing
	public void add(Shape s){
		shapes.add(s);
	}
	
	//removing shape from drawing
	public void remove(Shape s){
		shapes.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		shapes.clear();
	}
}