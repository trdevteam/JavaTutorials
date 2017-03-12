package CreackingTheCodingInterview.ArraysAndStrings;

public class OneAway {

	public static void main(String[] args) {
		System.out.println(isOneEdit("pakx","palx"));
	}
	
	public static boolean isOneEdit(String s1,String s2){
	
		int size1= s1.length();
		int size2= s2.length();
		
		
		if(Math.abs(size1-size2)>1){
			return false;
		}
		
		if(size1 == size2){
			
			return oneEditReplace(s1, s2, size1);
			
		}else{			
				
			if(size1<size2){
				
				return oneEditInsert(s2,s1,size2,size1);
				
			}else{
				
				return oneEditInsert(s1,s2,size1,size2);
				
			}		
			
		}
		
	}
	
	static boolean oneEditInsert(String first,String second,int sizeFirst,int sizeSecond){
	
		for(int i=0;i<sizeSecond;i++){			
			if(!first.contains(second.subSequence(i,i+1))){
				return false;
			}	
			
		}		
		
		return true;
	}
	
	
	static boolean oneEditReplace(String first,String second,int size){
		
		boolean foundDifference = false;
		for(int i=0;i<size;i++){
			
			if(first.charAt(i)!=second.charAt(i)){
				if(foundDifference){
					return false;
				}
				foundDifference = true;
			}
			
		}
		return true;
	}
	
}
