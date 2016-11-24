package String.Easy;

import java.util.Scanner;

public class BeatifulString {

	//Sample Input
	//10
	//0100101010
	
	public static void main(String[] arg){
		
		String S = "100101";
		char[]strChar = S.toCharArray();
		int size2 = strChar.length;
		
		String t="";
		for(int i=0;i<size2;i++){
			
			t = String.valueOf(strChar,i,size2-i);
			System.out.println(t);
		}
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String str = scan.next();
		scan.close();
		
//		mySolution(size,str);
				
		bestSolution(size, str);		
		
	}

	private static void bestSolution(int size, String str) {
		char [] inp = str.toCharArray();
		int cnt = 0;
		for(int i =0 ; i <= size-3 ; ++i)
		{
			if(inp[i]=='0' && inp[i+1]=='1' && inp[i+2]=='0')
			{
				cnt++;
				inp[i+2]='1';
			}
		}
		System.out.println(cnt);
	}
	
	private static void mySolution(int size,String str){		

		int tempCount = 0;
		int count[]= new int[size];
		if(size>=3){
			for(int i=0;i<size-2;){
				
			    if(str.substring(i, i+3).equals("010")){			    	
			    	tempCount++;	
			    	i++;
			    }else{
			    	count[i] = tempCount;
			    	tempCount = 0;			    	
			    }	
				i++;
			}
		}
		
		count[size-1] =  tempCount;
		
		int sum=0;
		
		for(int i=0;i<size;i++){
			sum+=count[i]>1 ? (count[i]+1)/2:count[i];
		}
		System.out.println(sum);
		
	}
	
}
