package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> ilist = new ArrayList<>();
		ilist.add(1);
		ilist.add(2);
		ilist.add(3);
		ilist.add(4);
		
		Email e = new Email();
		
		int[] arr1 =  {1,2,3,4,5};
		
		ArrayList<Integer> arList  = new ArrayList<>();
		arList.add(1);
		arList.add(1);
		arList.add(1);
		arList.add(1);
		
		String v = "tarikj-murat";
		
		String v2 = v.substring(0,v.indexOf('-'));
		
		System.out.println("value = "+ v2);		
		
		ArrayList<Long> liste = new ArrayList<>();
		
		for(long i=0L;i<1000000L;i++){
			liste.add(i);
		}
		
		long startTime = System.currentTimeMillis();
		int a = Collections.binarySearch(liste, 500000L);
		
		System.out.println(a);
		
		for(long l : liste) {
			
			if(l==500000L)
				break;
			
		}
		
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("time "+totalTime +" ms");
		
		classicFor(liste);
		classicForEach(liste);
		listForEach(liste);
		streamListForEach(liste);
		
	}
	
	public static void classicFor(ArrayList<Long> liste ){
		
		long startTime = System.currentTimeMillis();
		
		
		for(int i = 0; i < liste.size(); i++) {
			doIt(liste.get(i));
		}

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("classicFor "+totalTime +" ms");
		
	}
	
	public static void classicForEach(ArrayList<Long> liste ){
		
		long startTime = System.currentTimeMillis();
		
		for(long i : liste) {
			doIt(i);
		}
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("classicForEach "+totalTime+ " ms");
		
	}
	
	public static void listForEach(ArrayList<Long> liste ){
		
		long startTime = System.currentTimeMillis();
		
		liste.forEach(i -> doIt(i));
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("listForEach "+totalTime+ " ms");
		
	}
	
	public static void doIt(long i) {
		
	}
	
	public static void streamListForEach(ArrayList<Long> liste ){
		
		long startTime = System.currentTimeMillis();
		liste.stream().forEach(i -> doIt(i));
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("streamListForEach "+totalTime+" ms");
		
	}
	
	
}
