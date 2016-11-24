package String.Easy;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Capitalize {
public static void main(String[] args) {
	    
	    String text = "jon    skeet, miles o'brien, old mcdonald";

	    Pattern pattern = Pattern.compile("\\b([a-z])([\\w]*)");
	    Matcher matcher = pattern.matcher(text);
	    StringBuffer buffer = new StringBuffer();
	    while (matcher.find()) {
	        matcher.appendReplacement(buffer, matcher.group(1).toUpperCase() + matcher.group(2));
	    }
	    String capitalized = matcher.appendTail(buffer).toString();
	    System.out.println(capitalized);
	    
	    System.out.println(capitalize(text));
	    
	    
}

private static String capitalize(String line)
{
    StringTokenizer token =new StringTokenizer(line);
    String CapLine="";
    while(token.hasMoreTokens())
    {
        String tok = token.nextToken().toString();
        CapLine += Character.toUpperCase(tok.charAt(0))+ tok.substring(1)+" ";        
    }
  return CapLine.substring(0,CapLine.length()-1);
}



}
