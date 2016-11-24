package Implementation.Easy;

import java.util.Scanner;

public class Kangaroo {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	int x1 = scan.nextInt();
    	int v1 = scan.nextInt();
    	int x2 = scan.nextInt();
    	int v2 = scan.nextInt();
    	scan.close();
    	
    	if(v1>v2 && x1<x2){    		
    		getKangoroos(v1,v2,x2,x1);
    	}else if(v2>v1 && x1>x2 ){
    		getKangoroos(v2,v1,x1,x2);
    	}else if(v2==v1 && x2==x1){
    		System.out.println("YES");
    	}else{
    		System.out.println("NO");
    	}
    	
    }
    
    private static void getKangoroos(int bigV,int littleV,int bigX,int littleX){
    	
    	boolean isOnSameLine = false;
    	
    	while(true){
    		
    		if(bigX<littleX)
    			break;
    		
    		bigX = bigX + littleV;
    		littleX = littleX + bigV;
    		
    		if(bigX == littleX){
    			isOnSameLine = true;
    		}  		    		
    		
    	}
    	
    	if(isOnSameLine){
    		System.out.println("YES");
    	}else{
    		System.out.println("NO");
    	}
    	
    	
    }
    
	
}
