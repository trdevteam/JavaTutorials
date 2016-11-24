package String.Easy;
import java.util.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        
        char[]ts= s.toCharArray();
        int ll=1;
        for(int i=0;i<ts.length;i++){
        	
//        	if (Character.toString(ts[i]).matches("[A-Z?]"))
//        		ll++;
        	
         	if ('Z'>=ts[i])
        		ll++;
        	
        }
        
        System.out.println(ll);
        
        String[] words = s.split("[A-Z]");
        System.out.println(words.length);
        
    }
}
