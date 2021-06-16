package DesignPatterns.Structural.Decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


	public static void main(String[] args) {
		Car c = new BasicCar();
		CarDecorator d = new LuxCar(c);
		d.assemble();
	   
		
		int[] t = getInt();
		
		List<int[]> l = Arrays.asList(t);
		
		System.out.println(l);
		
	}
	
	
	private static int[] getInt() {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		
		int[] a = list.stream().mapToInt(i -> i).toArray();
	    	
		return a;
	}
	
}
