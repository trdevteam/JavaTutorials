package DynamicProgramming;

import java.util.*;

/*
--örnek input
2 
4 
1 2 3 4
6
2 -1 2 3 4 -5
*/

public class TheMaximumSubArray {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int n = 0;
		for(int i=0;i<T;i++){
			
			n = scan.nextInt();
			int a[] = new int[n];
			for(int j=0;j<n;j++){
				a[j] = scan.nextInt();
			}
			
			printSum(a);
			
		}
		
		scan.close();
		
	}
	
	 
    private static void printSum(int[] Array){
        
        int size= Array.length;
        int sum=0;
        long maxSum= Long.MIN_VALUE;
        long non_contiguous = Long.MIN_VALUE;
        
        for(int i=0;i<size;i++){
            
            sum += Array[i];
            
            if((non_contiguous < Array[i]|| Array[i]>=0) && non_contiguous<0)
                non_contiguous=Array[i];
            else if(Array[i]>=0){
                non_contiguous+=Array[i];
            }
            
            if(Array[i]>sum)
            	sum=Array[i];
                
            if(maxSum<sum){
                maxSum=sum;
            }else if(sum<0){
                sum= Array[i];
            }
            
        }        
        
        System.out.print(maxSum);
        System.out.print(" ");
        System.out.print(non_contiguous);
        System.out.println("");
    }	

}
