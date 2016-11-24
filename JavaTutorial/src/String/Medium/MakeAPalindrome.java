package String.Medium;

import java.util.Scanner;

public class MakeAPalindrome {
	
	//Sample input
	// 6 3
	// 092282

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int size = scan.nextInt();
		int tryCount = scan.nextInt();
		String str = scan.next();
		scan.close();	
		
		mySolution(size, tryCount, str);
		
//      bestSolution(size, tryCount, str);
		
	}

	private static void bestSolution(int size, int tryCount, String str) {
		char[] c = str.toCharArray();
        boolean[] ch = new boolean[size];
        for (int i = 0; i < size/2; ++i) {
            if (c[i] != c[size - i - 1]) {
                c[i] = c[size - i - 1] = (char)Math.max(c[i], c[size - i - 1]);
                ch[i] = true;
                --tryCount;
            }
        }
        if (tryCount < 0) {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < size/2; ++i) {
            if (c[i] != '9') {
                if (ch[i] && tryCount > 0) {
                    c[i] = c[size - i - 1] = '9';
                    --tryCount;
                }
                if (!ch[i] && tryCount > 1) {
                    c[i] = c[size - i - 1] = '9';
                    tryCount -= 2;
                }
            }
        }
        if (size % 2 == 1 && tryCount > 0) {
            c[size/2] = '9';
        }
        System.out.println(new String(c));
	}

	private static void mySolution(int size, int tryCount, String str) {
		
		char[] strChar = str.toCharArray();
		int count = 0;		
		for(int i=0;i<size/2;i++){
			if(strChar[i]!=strChar[size-i-1]){
				count++;
			}
		}		
		if(count>tryCount){
			System.out.println(-1);		
			return;
		}else{	
			 
			int extraTryCount = tryCount - count;
			for(int i=0;i<size/2;i++){
				
				if(tryCount==0)
					break;
				
				if(strChar[i] == strChar[size-i-1] && strChar[i]!='9' && extraTryCount>0 && tryCount>1){
					strChar[i]='9';
					strChar[size-i-1]='9';
					extraTryCount --;
					tryCount=tryCount-2;
				}
				
				if(strChar[i]!= strChar[size-i-1] && tryCount>0){
					
					if(extraTryCount>0 && tryCount>1 && strChar[i]!='9' && strChar[size-i-1]!='9'){
						strChar[i]=strChar[size-i-1]='9';
						extraTryCount --;
						tryCount--;
					}else if(strChar[i]>strChar[size-i-1]){
						strChar[size-i-1] = strChar[i];
					}else{
						strChar[i] = strChar[size-i-1];
					}
					tryCount --;
				}					
				
			}	
		
			
		}
		
		if(tryCount>0 && size%2>0)
			strChar[size/2] = '9';
		
		System.out.println(strChar);
	}
	
	
}
