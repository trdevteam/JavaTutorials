package TrickPrograms;


class A11{
	
	void method(int i)
	{
		System.out.println("A11 int");
	}	
}

class B11 extends A11{
	
	void method(Integer i){
		System.out.println("B11 Integer");
	}
	
}

public class Tr16AutoboxOverride {

	public static void main(String[] args) {
		
		A11 a = new B11();
		a.method(new Integer(10));
		a.method(10);
		
		B11 b = new B11();
		b.method(new Integer(10));
		b.method(10);
		
	}
	
}
