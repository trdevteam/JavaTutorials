package AdvancedTopics.MultiThreading.Ap5ThreadSafetySingleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		System.out.println("Main");
		
		BillPughSingleton b = BillPughSingleton.getInstance();
		b = BillPughSingleton.getInstance();
		b = BillPughSingleton.getInstance();
		b = BillPughSingleton.getInstance();
		b = BillPughSingleton.getInstance();
		
	}
	
}
