package Test;

public class Child extends Base{
	
	private int x;
	
	public Child(int x) {
		super(x);
		this.x=x;
	}

	public void hello() {
		for(int i=0;i<x;i++) {
			System.out.println("hello");
		}
	}	
	
	public static void main(String[] args) {
		Base a= new Base(2);
		a.hello();
		System.out.println("--------");
		Base b = new Child(5);
		b.hello();
	}
	
	
}
