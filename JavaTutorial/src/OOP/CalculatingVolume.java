package OOP;

import java.util.Scanner;

public class CalculatingVolume {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		int testCaseCount= scan.nextInt();			
		
		for(int i=0;i<testCaseCount;i++){
			int ch= scan.nextInt();	
			AbstractIshape shape = ShapeFactory.getInstance(ch);
			try{
				shape.setParameter(scan);
				System.out.println(shape.calculateVolume());
			}catch(Exception e){
				System.out.println("java.lang.NumberFormatException: All the values must be positive");
			}
			
		}			
		
	}
	
	
}
