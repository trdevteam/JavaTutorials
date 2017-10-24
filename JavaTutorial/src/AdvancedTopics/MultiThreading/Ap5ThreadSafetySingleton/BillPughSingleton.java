package AdvancedTopics.MultiThreading.Ap5ThreadSafetySingleton;

public class BillPughSingleton {

    private BillPughSingleton(){
    	System.out.println("Bill Paugh");
    }
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}