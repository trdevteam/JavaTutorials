package TrickPrograms;

public class T1JavaCompiler {

	public static final int x = 40;
	
	static{
		System.out.println("Program1 Loaded");	
	}
	
	public static void main(String[] args) {
		System.out.println(T1JavaCompiler.x);
		System.out.println(T.y); // System.out.println(100);
	}
	
}

class T{
	
	public static final int y = 100; 
	public static int z = 100; 
	static{
		z = 80;
		System.out.println("T Loaded");			
	}		
			
}