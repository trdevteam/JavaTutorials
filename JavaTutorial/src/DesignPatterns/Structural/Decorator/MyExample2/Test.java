package DesignPatterns.Structural.Decorator.MyExample2;

public class Test{
	
	public static void main(String[] args){
		
		LedTV ledTV = new LedTV(new FlatScreenTV(new BasicTV()));
//		ledTV.getScreen();		
		LCDTV lcdTV = new LCDTV(ledTV);
		lcdTV.getScreen();
	}
	
}
