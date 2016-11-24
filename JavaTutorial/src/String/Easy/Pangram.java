package String.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] arg){
		
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		scan.close();
		// We promptly judged antique ivory buckles for the next prize (pangram)
		System.out.println(isPanagram(s) ? "Panagram" : "Not Panagram");
		
	}
	
	private static boolean isPanagram(String str){
		
		HashMap<Character,Integer> charMap = new HashMap<Character, Integer>();
		
		str = str.toLowerCase();
		int size = str.length();
		
		for(int i=0;i<size;i++){
			
			if(!charMap.containsKey(str.charAt(i)) && str.charAt(i)>='a' && str.charAt(i)<='z'){
				charMap.put(str.charAt(i), 1);
			}
			
		}
		
		if(charMap.size()==26)		
			return true;
		else
			return false;
	}
	
}
