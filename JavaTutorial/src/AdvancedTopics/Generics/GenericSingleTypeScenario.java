package AdvancedTopics.Generics;

import java.util.List;

@SuppressWarnings("hiding")
public class GenericSingleTypeScenario<Integer> {

	 public void readOnly(List<? extends Number> numbers) {
	  for (Number number : numbers) {
	   System.out.println("readOnly: " + number);
	  }
	 }

	 public void writeOnly(List<? super Integer> numbers, Integer aNumber) {
	  numbers.add(aNumber);
	 }

	 public void writeAndRead(List<Integer> numbers, Integer aNumber) {
	  numbers.add(aNumber);
	  for (Integer integer : numbers) {
	   System.out.println("readAndWrite: " + integer);
	  }

	 }
	}