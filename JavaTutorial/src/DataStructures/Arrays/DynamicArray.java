package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);		
		
		int N = scan.nextInt();
		int Q = scan.nextInt();		
		scan.close();
		
		ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>(N);	
		
		
		for(int i=0;i<N;i++){
			seqList.add(new ArrayList<Integer>());			
		}
		
		int lastAns = 0;
		int a = 0;
		int x = 0;
		int y = 0;		
				
		for(int i=0;i<Q;i++){
			
			a = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(a==1){
				int seq = (x^lastAns)%N;
				ArrayList<Integer> subArray = seqList.get(seq);
				subArray.add(y);
			}
			
			if(a==2){
				int seq = (x^lastAns)%N;
				ArrayList<Integer> subArray = seqList.get(seq);
				int index = y % subArray.size();
				int value = (int) subArray.get(index);
				lastAns = value;
				System.out.println(lastAns);				
			}			
			
		}
		
		
	}

}
