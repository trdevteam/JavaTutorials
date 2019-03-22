package Test;

public class Base {

	private int x;
	public Base(int x) {
		this.x=x;
	}
	
	public void hello() {
		for(int i=0;i<x;i++) {
			System.out.println("hello");
		}
	}
	
}
