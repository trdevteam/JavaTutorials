package OOP;

import java.util.Scanner;

public class Hemisphere extends AbstractIshape{

	@Override
	public double calculateVolume() {
		double r = parameters.get("r");
		return (4/6)*Math.PI*Math.pow(r, 3);
	}

	@Override
	public void setParameter(Scanner scan) throws Exception {
		double r = scan.nextDouble();
		super.setParameter("r", r);		
	}
	
}
