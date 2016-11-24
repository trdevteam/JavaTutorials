package OOP;

import java.util.Scanner;

public abstract class AbstractIshape implements IShape {

	  public abstract void setParameter(Scanner scan) throws Exception;
	  
	  public void setParameter(String key,double value) throws Exception{
		  if(value<0){
			  throw new Exception("java.lang.NumberFormatException: All the values must be positive");
		  }
		  parameters.put(key, value);		 
	  };
	  

}
