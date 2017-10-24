package Test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		String v = "tarikj-murat";
		
		String v2 = v.substring(0,v.indexOf('-'));
		
		System.out.println("value = "+ v2);		
		
		ArrayList<String> liste = new ArrayList<String>();
		
		for(long i=0L;i<100000L;i++){
			liste.add("tarik");
		}
		
		classicFor(liste);
		classicForEach(liste);
		listForEach(liste);
		streamListForEach(liste);
		
	}
	
	public static void classicFor(ArrayList<String> liste ){
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < liste.size(); i++) {
			doIt(liste.get(i));
		}

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("classicFor "+totalTime +" ms");
		
	}
	
	public static void classicForEach(ArrayList<String> liste ){
		
		long startTime = System.currentTimeMillis();
		
		for(String i : liste) {
			doIt(i);
		}
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("classicForEach "+totalTime+ " ms");
		
	}
	
	public static void listForEach(ArrayList<String> liste ){
		
		long startTime = System.currentTimeMillis();
		
		liste.forEach(i -> doIt(i));
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("listForEach "+totalTime+ " ms");
		
	}
	
	public static void doIt(String i) {
		
	}
	
	public static void streamListForEach(ArrayList<String> liste ){
		
		long startTime = System.currentTimeMillis();
		liste.stream().forEach(i -> doIt(i));
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("streamListForEach "+totalTime+" ms");
		
	}
	
	
}
