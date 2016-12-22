package TrickPrograms;

import java.util.HashSet;
import java.util.Set;

public class Tr11DoubleBraceInitialization {

	public static void main(String[] args) {
		
		Set<String> validCodes = new HashSet<String>();
		validCodes.add("Dev");
		validCodes.add("QA");
		System.out.println(validCodes);
		
		Set<String> validCodes1 = new HashSet<String>(){
			
			{
			    add("Dev");
			}
			
			{
				add("QA");
			}
			
		};
		
		System.out.println(validCodes1);
		
	}
	
}
