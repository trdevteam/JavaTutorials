package AdvancedTopics.Generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenericSingleTypeScenario {
  
 public static void main(String[] args) {
  GenericSingleTypeScenario<Integer> singleType = new GenericSingleTypeScenario<Integer>();
  List<Integer> numbers = new ArrayList<Integer>();
  numbers.add(1); //autoboxes 1 to type Integer
  
  singleType.readOnly(numbers);
  singleType.writeOnly(numbers, 6);  //autoboxes 6 to type Integer
  singleType.writeAndRead(numbers, Integer.valueOf(9));
  
 }
}