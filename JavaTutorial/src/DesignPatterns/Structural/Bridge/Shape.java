package DesignPatterns.Structural.Bridge;

public abstract class Shape {
	//Composition - implementor
	protected Color color;
	
	//constructor with implementor as input argument
	public Shape(Color c){
		this.color=c;
	}
	
	public abstract void draw();
	
	public abstract void applyColor();
	
}