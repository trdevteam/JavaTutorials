package OOP;

import java.util.Scanner;


public class Cube extends AbstractIshape {

	@Override
	public double calculateVolume() {		
		double a = parameters.get("a");
		return Math.pow(a, 3);
	}

	@Override
	public void setParameter(Scanner scan) throws Exception {
		double a = scan.nextDouble();
		super.setParameter("a", a);		
	}
	
}
