package TrickPrograms;

public class T3StackOverFlow {
	
	T3StackOverFlow(String s){
		System.out.println(s);
	}
	
//	T3StackOverFlow t = new T3StackOverFlow("inside");  //stackOverFlow
	
	static T3StackOverFlow t = new T3StackOverFlow("static");
	
	public static void main(String[] args) {
		
		T3StackOverFlow test = new T3StackOverFlow("main");
		
	}

}
