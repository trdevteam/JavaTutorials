package AdvancedTopics.Generics;

import java.util.ArrayList;
import java.util.List;

//Q
//If java.lang.Object is the super type for java.lang.Number and, Number is the super type for java.lang.Integer, 
//am I correct in saying that List<Object> is the super type for List<number> and, List<Number> is the super type for List<Integer>.

//A
// No. List<Object> is not the the super type of List<Number>. 
//If that were the case, then you could add objects of any type, and it defeats the purpose of Generics.

public class WildCards {
	
	public static void main(String[] args) {
		
		///* Compile Error: Type mismatch. Cannot convert from ArrayList<Integer> to List<Number>*/
//		List<Number> numbers2 = new ArrayList<Integer>();		 
		 
		//Compiles
		List<Integer> numbers3 = new ArrayList<Integer>();
		 
		 
		/*Compile Error: Cannot instantiate the type ArrayList<? super Integer>*/
//		List<? super Integer> numbers6 = new ArrayList<? super Integer>();
		 
		 
		//Compiles
		List<? super Integer> numbers7 = new ArrayList<Integer>();
		numbers7.add(Integer.valueOf(5));
		 
		 
		//Compiles
		List<? extends Number> numbers5 = new ArrayList<Number>();
		//Compile error:  Read only.Can't add
//		numbers5.add(Integer.valueOf(5));		 
		
		
	}
	
}
