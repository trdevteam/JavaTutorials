package OOP;

import java.util.HashMap;
import java.util.Scanner;

public class Cuboid extends AbstractIshape{

	@Override	
	public double calculateVolume() {		
		double l = parameters.get("l");
		double b = parameters.get("b");
		double h = parameters.get("h");			
		return l*b*h;
	}

	@Override
	public void setParameter(Scanner scan) throws Exception {
		double l = scan.nextDouble();
		double b = scan.nextDouble();
		double h = scan.nextDouble();
		super.setParameter("l", l);
		super.setParameter("b", b);
		super.setParameter("h", h);	
	}	

}
