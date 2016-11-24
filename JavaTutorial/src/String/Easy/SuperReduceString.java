package String.Easy;
import java.util.*;

public class SuperReduceString {


    public static void main(String[] value) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        
        getReduceString(s);

    }	
    
    public static void getReduceString(String s){
       
    	StringBuilder sb = new StringBuilder();
    	char[] ts = s.toCharArray();    	
    	int size = ts.length;    	
    	
    	for(int i=0;i<size;i++){
    		
    		if(i<size-1 && ts[i]==ts[i+1]){
    		    i++;
    		}else{
    			sb.append(ts[i]);
    		}
    		
    	}    		
    	
    	if(sb.length()!=s.length()){
    		getReduceString(sb.toString());
    	}else{    	
    	    System.out.println( (sb.toString().isEmpty()) ? "Empty String" : sb.toString());
    	}
    	
    }
	
}
