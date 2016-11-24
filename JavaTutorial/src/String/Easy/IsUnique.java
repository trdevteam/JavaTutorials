package String.Easy;

import java.util.HashMap;

public class IsUnique {
	
	public static void main(String[] arg){
		System.out.println(isuniqueString("tarik"));		
	}
	
	private static boolean isuniqueString(String s){
		HashMap<Character,Integer> countMap = new HashMap<Character, Integer>();
		
		int size = s.length();
		
		for(int i=0;i<size;i++){
			
			if(countMap.containsKey(s.charAt(i))){
				return false;
			}else{
				countMap.put(s.charAt(i), 1);
			}
			
		}
		
		return true;
	}

}
