package TrickPrograms;

public class Tr13AutoBoxingWrapperClasses {

	
	public static void main(String[] args) {
		
		Long l = new Long(0);
		System.out.println(l.equals(0));//false
		System.out.println(l.equals(0l));//true		
		
		Double d = new Double(0);
		System.out.println(d.equals(0));
		System.out.println(d.equals(0d));
		
		Float f = new Float(0);
		System.out.println(d.equals(0));
		System.out.println(d.equals(0f));
		
	}
	
}
