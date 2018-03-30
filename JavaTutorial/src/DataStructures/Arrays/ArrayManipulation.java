package DataStructures.Arrays;

import java.io.IOException;
import java.util.Scanner;


//You are given a list(1-indexed) of size , initialized with zeroes. 
//You have to perform  operations on the list and output the maximum of final values of all the  elements in the list. F
//or every operation, you are given three integers ,  and  and you have to add value  to all the elements ranging from index  to (both inclusive).
//
//For example, consider a list  of size . The initial list would be  = [, , ] and after performing the update  = , the new list would be  = [, , ]. 
//Here, we've added value 30 to elements between indices 2 and 3. Note the index of the list starts from 1.
//
//Input Format
//
//The first line will contain two integers  and  separated by a single space.
//Next  lines will contain three integers ,  and  separated by a single space.
//Numbers in list are numbered from  to .
//
//Output Format
//Print in a single line the maximum value in the updated list.
//
//Sample Input
//
//5 3
//1 2 100
//2 5 100
//3 4 100
//Sample Output
//
//200

public class ArrayManipulation {

	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	
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
    
	
}
