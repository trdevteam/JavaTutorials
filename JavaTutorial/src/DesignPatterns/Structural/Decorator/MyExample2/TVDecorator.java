package DesignPatterns.Structural.Decorator.MyExample2;

public class TVDecorator implements TV{

	protected TV t;
	
	@Override
	public void getScreen() {
		t.getScreen();		
	}
	
	public TVDecorator(TV tv){
		t = tv;
	}

}
