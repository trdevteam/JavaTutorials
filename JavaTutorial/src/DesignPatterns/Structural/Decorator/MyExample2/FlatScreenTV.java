package DesignPatterns.Structural.Decorator.MyExample2;

public class FlatScreenTV extends TVDecorator{

	public FlatScreenTV(TV tv) {
		super(tv);
	}
	
	public void getScreen(){
		super.getScreen();
		System.out.println("Flat tv");
	}

}
