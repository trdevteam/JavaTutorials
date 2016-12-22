package TrickPrograms;

public class T8StatichMethodWithNull {	
	
	public static void main(String[] args) {
		
		A a = null;
		a.methodA();
		
	}

}


class A{
	
	static void methodA(){
		
		System.out.println("Static Method");
		
	}
	
}