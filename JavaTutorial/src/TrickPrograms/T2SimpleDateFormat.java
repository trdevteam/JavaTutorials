package TrickPrograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T2SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdfInput = new SimpleDateFormat("dd/mm/yyyy G");
		SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-mm-dd G");
		
		Date date = sdfInput.parse("-1/1/2016 AD");
		
		System.out.println(date);
		
		String output = sdfOutput.format(date);
		
		System.out.println(output);
		
	}
	
	
	
}
