package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 85);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 85);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
		Stream<Integer> highNumsSeq2 = sequentialStream.filter(p -> p > 100);
		highNumsSeq2.forEach(p -> System.out.println("High Nums sequential="+p));

	}

}