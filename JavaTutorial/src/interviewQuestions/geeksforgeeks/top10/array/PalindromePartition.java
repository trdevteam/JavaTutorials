package interviewQuestions.geeksforgeeks.top10.array;

public class PalindromePartition {

	public static void main(String[] args) {
		
		String str = "abcba";
		System.out.println(isPalindrome(str));
		System.out.println(partitionCount(str));
		
	}
	
	public static int partitionCount(String str) {
		
		int n = str.length();
		int cut[][]= new int[n][n];
		boolean pal[][] = new boolean[n][n]; 
		
		for (int i=0; i<n; i++) {
		      pal[i][i] = true;         //substring of length 1 is plaindrome
		      cut[i][i] = 0;
		}

	   for (int len=2; len<=n; len++) {
	      for (int i=0; i<n-len+1; i++) {        //find all substrings of length len

	         int j = i+len-1;              // Set ending index
	         
	         if (len == 2)                 //for two character string
	            pal[i][j] = (str.charAt(i) == str.charAt(j));
	         else                  //for string of more than two characters
	            pal[i][j] = (str.charAt(i) == str.charAt(j)) && pal[i+1][j-1];

	         pal[i][j] = isPalindrome(str.substring(i,j));
	         
	         if (pal[i][j] == true)
	            cut[i][j] = 0;
	         else {
	            cut[i][j] = Integer.MAX_VALUE;          //initially set as infinity
	            for (int k=i; k<=j-1; k++)
	               cut[i][j] =  Math.min(cut[i][j], cut[i][k] + cut[k+1][j]+1);
	         }
	      }
	   }
		
		return cut[0][n-1];
		
	}
	
	
	
	public static boolean isPalindrome(String s) {
		
		for(int i=0;i<s.length()/2;i++) {
			
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
			
		}
		
		return true;
	}
	
}
