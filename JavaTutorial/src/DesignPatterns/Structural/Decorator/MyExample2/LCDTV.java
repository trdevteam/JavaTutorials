package DesignPatterns.Structural.Decorator.MyExample2;

public class LCDTV extends TVDecorator{

	public LCDTV(TV tv) {
		super(tv);
	}

	public void getScreen(){
		super.getScreen();
		System.out.println("LCD tv");
	}
	
}
