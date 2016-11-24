package DataStructures.Arrays;

import java.util.Scanner;

public class LefRotation {
	
	public static void main(String[] arr) {
		
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();
		int r = scan.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++){			
			array[i] = scan.nextInt();				
		}
		
		scan.close();
		
		for(int i=0;i<r;i++){
			
			int temp = array[0];
			
			for(int j=0;j<array.length-1;j++){	
				array[j] = array[j+1];				
			}
			
			array[array.length-1] = temp;
			
		}
		
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		
	}

}
