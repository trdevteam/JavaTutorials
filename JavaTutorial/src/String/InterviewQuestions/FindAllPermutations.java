package String.InterviewQuestions;

import java.util.ArrayList;

public class FindAllPermutations {

	public static ArrayList<String>  permutationFinder(String str){
		
		ArrayList<String> perm = new ArrayList<String>();
		
		if(str.length()==0){
			perm.add("");
			return perm;
		}			
		
		char first = str.charAt(0);
		String remaining = str.substring(1);
		
		ArrayList<String> words = permutationFinder(remaining);
		
		for(String strNew : words){
			
			for(int i=0;i<=strNew.length();i++){
				perm.add(charInsert(strNew, first, i));
			}
			
		}
		
		return perm;		
	}
	
	
	public static String charInsert(String str,char c,int j){
		
		String first = str.substring(0,j);
		String last = str.substring(j,str.length());
		return first +c+last;
		
	}
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		System.out.println(permutationFinder(s));
	}
	
}
