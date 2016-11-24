package DesignPatterns.Creational.Singleton;

public class LazySingleton {

	public static LazySingleton instance=null;
	
	private LazySingleton(){};
	
	public static LazySingleton getInstance(){
		if (instance==null)
			return new LazySingleton();
		else
			return instance;
	}
	
}
