package TrickPrograms;

public class T6IntegerChacheAutoboxing {

	public static void main(String[] args) {
		
		Integer i1 = Integer.valueOf(127);
		Integer i2 = 127;
		
		System.out.println(i1 ==i2);
		
		Integer i3 = 128; // false integer cache between -128 and 127
		Integer i4 = 128;
		
		System.out.println(i3 ==i4);
		
	}
	
}
