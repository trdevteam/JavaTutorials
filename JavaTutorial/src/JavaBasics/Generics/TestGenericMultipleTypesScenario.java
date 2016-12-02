package JavaBasics.Generics;

import java.util.ArrayList;
import java.util.List;
 
public class TestGenericMultipleTypesScenario {
 
 public static void main(String[] args) {
     //Integer
  GenericMultipleTypesScenario<Integer> integerType = new GenericMultipleTypesScenario<Integer>();
  List<Integer> numbers = new ArrayList<Integer>();
  numbers.add(1); //autoboxes 1 to type Integer
  
  integerType.readOnly(numbers);
  integerType.writeOnly(numbers, 6);  //autoboxes 6 to type Integer
  integerType.writeAndRead(numbers, Integer.valueOf(9));
  
  //Double
  GenericMultipleTypesScenario<Double> doubleType = new GenericMultipleTypesScenario<Double>();
  List<Double> numbersDouble = new ArrayList<Double>();
  numbersDouble.add(1.5); //autoboxes 1.5 to type Double
  
  doubleType.readOnly(numbersDouble);
  doubleType.writeOnly(numbersDouble, 6.5);  //autoboxes 6.5 to type Double
  doubleType.writeAndRead(numbersDouble, Double.valueOf(9.5));
  
 }
}
 