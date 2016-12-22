package TrickPrograms;

public class T5TernaryOparetorWithNull {

	static int foo(int i){
		
		return i<10 ? null : i;
		
	}
	
	public static void main(String[] args) {
		int x = foo(1); // <10 java.lang.NullPointerException
		System.out.println(x);
	}
	
}
