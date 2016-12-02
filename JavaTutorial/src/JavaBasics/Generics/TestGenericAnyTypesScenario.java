package JavaBasics.Generics;

import java.util.ArrayList;

public class TestGenericAnyTypesScenario {
	 
	 public static void main(String[] args) {
	  //integer type
	  GenericAnyTypesScenario<Integer> integerType = new GenericAnyTypesScenario<Integer>();
	  ArrayList<Integer> valuesIntegers = new ArrayList<Integer>();
	  valuesIntegers.add(1); //autoboxes 1 to type Integer
	  
	  integerType.readOnly(valuesIntegers);
	  integerType.writeOnly(valuesIntegers, 6);  //autoboxes 6 to type Integer
	  integerType.writeAndRead(valuesIntegers, Integer.valueOf(9));
	  
	  
	  //double type
	  GenericAnyTypesScenario<Double> doubleType = new GenericAnyTypesScenario<Double>();
	  ArrayList<Double> valuesDouble = new ArrayList<Double>();
	  valuesDouble.add(1.5); //autoboxes 1.5 to type Double
	  
	  doubleType.readOnly(valuesDouble);
	  doubleType.writeOnly(valuesDouble, 6.5);  //autoboxes 6.5 to type Double
	  doubleType.writeAndRead(valuesDouble, Double.valueOf(9.5));
	  
	  
	  //string type
	  GenericAnyTypesScenario<String> stringType = new GenericAnyTypesScenario<String>();
	  ArrayList<String> valuesString = new ArrayList<String>();
	  valuesString.add("apple");
	  
	  stringType.readOnly(valuesString);
	  stringType.writeOnly(valuesString, "orange");
	  stringType.writeAndRead(valuesString, "mango");
	  
	 }
	}