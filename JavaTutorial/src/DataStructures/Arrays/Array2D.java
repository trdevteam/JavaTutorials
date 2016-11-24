package DataStructures.Arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] value){		
		
		int[][]array = new int[6][6];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<6;i++){
			
			for(int j=0;j<6;j++){
				array[i][j] = scan.nextInt();
			}
			
		}
		scan.close();
		
		int sum = 0;
		int maxSum = -999999;
		
		for(int i=0;i<4;i++){
					
			for(int j=0;j<4;j++){
				sum=0;
				sum+=array[i][j];
				sum+=array[i][j+1];
				sum+=array[i][j+2];
				sum+=array[i+1][j+1];
				sum+=array[i+2][j];
				sum+=array[i+2][j+1];
				sum+=array[i+2][j+2];
				if(maxSum<sum)
					maxSum = sum;
				
			}
			
		}
		
		System.out.print(maxSum);
		
	}
	
}
