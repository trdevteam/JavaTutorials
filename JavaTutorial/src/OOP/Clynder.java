package OOP;

import java.util.Scanner;


@SuppressWarnings("unused")
public class Clynder extends AbstractIshape {

	@Override
	public double calculateVolume() {		
		double r = parameters.get("r");
		double h = parameters.get("h");
		return h*Math.PI*Math.pow(r, 2);
	}

	@Override
	public void setParameter(Scanner scan) throws Exception {
		double r = scan.nextDouble();
		double h = scan.nextDouble();
		super.setParameter("r", r);
		super.setParameter("h", h);
	}
	

}
