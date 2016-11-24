package AdvancedTopics.Generics;

public class Basic {
	
	  public static void main(String args[]) {
	    
		Gen<Integer> iOb = new Gen<Integer>(88);

	    iOb.showType();

	    int v = iOb.getob();
	    System.out.println("value: " + v);

	    System.out.println();

	    Gen<String> strOb = new Gen<String>("Generics Test");

	    strOb.showType();

	    String str = strOb.getob();
	    System.out.println("value: " + str);
	  }
}

class Gen<T> {
	  T ob; // declare an object of type T

	  Gen(T o) {
	    ob = o;
	  }

	  T getob() {
	    return ob;
	  }

	  void showType() {
	    System.out.println("Type of T is " + ob.getClass().getName());
	  }
	}


	
