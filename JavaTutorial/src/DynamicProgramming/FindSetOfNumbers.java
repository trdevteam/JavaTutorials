package DynamicProgramming;

import java.util.HashMap;

public class FindSetOfNumbers {

	
	private static HashMap<String, Integer> mp = new HashMap<>();
	
	public static void main(String[] args) {
		
		int[] arr = {1,2};
		
//		System.out.println(dpGetTotalSum(arr,5,0,mp)); // toplamı 16 olan kaç set var ?;
		
		System.out.println(dpGetPossibleTotal(5,""));
		
	}
	
	private static int dpGetTotalSum(int[]arr , int total,int i,HashMap<String, Integer> mp) {
		
		String key = String.valueOf(total) + ":" + String.valueOf(i);
		int to_return = 0;				
		
		if(mp.containsKey(key)) {
			return mp.get(key);
		}
		
		if(total==0)
			return 1;
		else if(total<0)
			return 0;
		else if (i == arr.length)
			return 0;
		else if(total<arr[i])
			to_return = dpGetTotalSum(arr,total,i+1,mp);
		else
			to_return = dpGetTotalSum(arr,total-arr[i],i+1,mp) 
			+ dpGetTotalSum(arr,total,i+1,mp);
		
		mp.put(key, to_return);
		return to_return;
	}
	
	private static String dpGetPossibleTotal(int total,String t) {		
				
		if(total<0)
			return "";
		else if(total==0)
			return t+"\n";
		else
			return dpGetPossibleTotal(total-1,t+"1") 
			+ dpGetPossibleTotal(total-2,t+"2");
		
	}
	
}
