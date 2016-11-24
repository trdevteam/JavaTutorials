package DesignPatterns.Structural.Decorator.MyExample2;

public class LedTV extends TVDecorator{

	public LedTV(TV tv) {
		super(tv);
	}
	
	public void getScreen(){
		super.getScreen();
		System.out.println("Led ekran tv");
	}

}
