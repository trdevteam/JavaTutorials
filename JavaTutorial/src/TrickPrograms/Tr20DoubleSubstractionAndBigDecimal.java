package TrickPrograms;

import java.math.BigDecimal;

public class Tr20DoubleSubstractionAndBigDecimal {
	
	public static void main(String[] args) {
		
		double d = 1.1 - 1;
		
		if(d==0.1){
			System.out.println("Hello");
		}else{
			System.out.println("Hi");
		}
		
		System.out.println(d);
		
		BigDecimal d1 = new BigDecimal("1.10").subtract(new BigDecimal("1"));
		
		System.out.println(d1);
		
	}

}
