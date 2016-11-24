package DynamicProgramming;

public class Permutation {

	public static void main(String[] v){
		permutation("tarik","");
//		perm1("","tarik");
//		perm2("tarik");
	}
	
	public static void permutation(String str, String prefix){
		
		int n=str.length();
		if(n==0){
			System.out.println(prefix);
		}else{
			
			for(int i=0;i<n;i++){				
				String rem = str.substring(0, i) + str.substring(i+1, n);
				permutation(rem,prefix+str.charAt(i));						
			}				
		}
		
	}
	
    public  static void perm1(String s) { perm1("", s); }
    private static void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
        }

    }
	
	  public static void perm2(String s) {
	        int n = s.length();
	        char[] a = new char[n];
	        for (int i = 0; i < n; i++)
	            a[i] = s.charAt(i);
	        perm2(a, n);
	    }

	    private static void perm2(char[] a, int n) {
	        if (n == 1) {
	            System.out.println(a);
	            return;
	        }
	        for (int i = 0; i < n; i++) {
	            swap(a, i, n-1);
	            perm2(a, n-1);
	            swap(a, i, n-1);
	        }
	    }  

	    // swap the characters at indices i and j
	    private static void swap(char[] a, int i, int j) {
	        char c = a[i];
	        a[i] = a[j];
	        a[j] = c;
	    }
	
}
