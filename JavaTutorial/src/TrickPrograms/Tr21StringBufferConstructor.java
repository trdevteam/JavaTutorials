package TrickPrograms;

import java.util.Random;

public class Tr21StringBufferConstructor {
	
	private static Random rnd = new Random();
	
	public static void main(String[] args) {
		
		StringBuffer word = null;
		switch(rnd.nextInt(5)){		
			case 1:
				word = new StringBuffer('P');
			case 2:	
				word = new StringBuffer('G');
			default:
				word = new StringBuffer('M');
		}
		
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
		
		
	}

}
