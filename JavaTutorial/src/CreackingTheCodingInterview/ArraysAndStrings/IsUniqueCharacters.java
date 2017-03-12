package CreackingTheCodingInterview.ArraysAndStrings;

public class IsUniqueCharacters {

	
	public static void main(String[] args) {
		
		System.out.println(isUnique("tarik mur"));
		
	}
	
	private static boolean isUnique(String s){
		
		boolean[] char_set = new boolean[256]; 		
		
		for(int i=0;i<s.length();i++){
			
			if(char_set[s.charAt(i)])
				return false;
			
			char_set[s.charAt(i)]=true;
		}		
		
		return true;
		
	}
	
}
