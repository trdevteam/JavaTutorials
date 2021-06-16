package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {
	
	
	static <K,V extends Comparable<? super V>>
		SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}

	public static void main(String[] args) {	
		
		    Map<Integer, String> random = new HashMap<Integer, String>();
	        for (int i = 0; i < 10; i++) {
	            random.put(100-i, "a"+i);
	        }
	        
	        LinkedHashMap<Integer, String> sortedMap = 
	        		random.entrySet().stream().
	        	    sorted(Entry.comparingByValue()).
	        	    collect(Collectors.toMap(Entry::getKey, Entry::getValue,
	        	                             (e1, e2) -> e1, LinkedHashMap::new));
	
	        System.out.println(sortedMap);
	        
	        System.out.println(entriesSortedByValues(random));
	        
	        System.out.println("Initial Map: " + Arrays.toString(random.entrySet().toArray()));

		        // creating tree map 
		        NavigableMap<Integer, String> 
		            treemap = new TreeMap<Integer, String>(); 
		        
		        
		        
		        // populating tree map 
		        treemap.put(1, " A "); 
		        treemap.put(2, " B "); 
		        treemap.put(3, " C "); 
		        treemap.put(4, " D "); 
		        treemap.put(5, " D "); 
		        treemap.put(6, " E "); 
		        treemap.put(7, " F "); 
		  
		        // Since 6 is the least value greater than 5, 
		        // it is returned as the key. 
		        System.out.println("Ceiling key entry for 5: "
		                           + treemap.ceilingKey(5)); 
		    
		
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
	
	public class ValueComparator implements Comparator<Integer> {

	    private Map<Integer, String> map;

	    public ValueComparator(Map<Integer, String> map) {
	        this.map = map;
	    }

	    public int compare(Integer a, Integer b) {
	        return map.get(a).compareTo(map.get(b));
	    }
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
