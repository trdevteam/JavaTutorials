package DataStructures.Arrays;

import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String[] array = new String[N];
		
		for(int i=0;i<N;i++){
			
			array[i] = scan.next();
			
		}
		
		
		int Q = scan.nextInt();		
		
		String[]queries = new String[Q];
		
		for(int j=0;j<Q;j++){
			
			queries[j] = scan.next();
			
		}
		
		scan.close();
		
		int count =0;
		
		for(int i=0;i<Q;i++){
			
			count =0;
			for(int j=0;j<N;j++){
				
				if(array[j].equals(queries[i]))
					count++;
				
			}
			
			System.out.println(count);
			
		}
		
		
	}
	
}
