package TrickPrograms;

public class T7PassByValue {

	public static void main(String[] args) {
		int x = 50;
		String s = "0";
		
		System.out.println(x);
		System.out.println(s);
		
	}
	
	static void min(String s1){
		s1 = "100";		
	}
	
	static void min(int min){
		min = 100;				
	}
}
