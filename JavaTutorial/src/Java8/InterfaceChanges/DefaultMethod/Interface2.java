package Java8.InterfaceChanges.DefaultMethod;

public interface Interface2 {

	void method2();
	
	default void log(String str){
		System.out.println("I2 logging Interface2 ::"+str);
	}

}