package Test;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the arrayManipulation function below.
     */
    static long arrayManipulation2(int n, int[][] queries) {
        
       long[] arr = new long[n];        
        
       int rowLength = queries.length;
        
       for(int j =0;j<rowLength;j++){
               
               int a = queries[j][0];
               int b = queries[j][1];
               int k = queries[j][2];
               
           for(int i=a-1;i<b; i++){
               arr[i] = arr[i] + k;
           }
           
        }
        
         long max = (long) arr[0];
         for(int i=0;i<n;i++){
               if(max < arr[i]){
                   max = arr[i];
               }
         }

        return max;
    }

    static long arrayManipulation3(int n, int[][] queries) {
        
        long[] arr = new long[n];        
         
        int rowLength = queries.length;
        long max = 0L;
         
        for(int j =0;j<rowLength;j++){
                
            int a = queries[j][0];
            int b = queries[j][1];
            int k = queries[j][2];  
            
            for(int i=a-1;i<=b-1;i++) {
            	arr[i] = arr[i] +k;
            	if(max < arr[i]) {
            		max = arr[i];
            	}
            }
            
         }    

         return max;
     }
    
 static long arrayManipulation(int n, int[][] queries) {         
	   
	 
        int rowLength = queries.length;      
        
        long[] differenceArray = new long[n+1];
         
        for(int j =0;j<rowLength;j++){
                
            int a = queries[j][0];
            int b = queries[j][1];
            int k = queries[j][2];  
            
            differenceArray[a] += k;
            if (b+1<=n)
                differenceArray [b+1] -= k;
            
         }    

        long max = 0L;
        long  addedDifference = 0L; 
        for (int i=1; i<=n; i++) 
        {
            addedDifference = addedDifference + differenceArray[i];
            if (max < addedDifference)
                max = addedDifference;
        }
        
         return max;
     }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	 String Str = new String("Welcome to Tutorialspoint.com");

         System.out.print("Return Value :" );
         System.out.println(Str.matches("(.*)Tutorials(.*)"));

         System.out.print("Return Value :" );
         System.out.println(Str.matches("Tutorials"));

         System.out.print("Return Value :" );
         System.out.println(Str.matches("Welcome(.*)"));
    	
    	
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[][] queries = new int[m][3];

        for (int queriesRowItr = 0; queriesRowItr < m; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 3; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);
    }
}