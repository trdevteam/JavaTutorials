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
	

	static ArrayList<String> permList = new ArrayList<String>();
	
	  // Function to print all the permutations of str 
    static void getPermut(String str, String perm ) 
    { 
        if (str.length() == 0) { 
        	permList.add(perm);
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            char ch = str.charAt(i); 
  
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            getPermut(ros, perm+ch); 
        } 
        
    } 
	
	public static void main(String[] args) {
		
		String s = "ABC";
		ArrayList<String> perms = permutationFinder(s);
		System.out.println(perms);
		getPermut(s,"");
		System.out.println(permList);
	}
	
}
