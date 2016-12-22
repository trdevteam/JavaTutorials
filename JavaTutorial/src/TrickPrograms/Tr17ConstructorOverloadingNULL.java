package TrickPrograms;

public class Tr17ConstructorOverloadingNULL {
	
	public Tr17ConstructorOverloadingNULL(Object o){
		System.out.println("Object");
	}
	
	public Tr17ConstructorOverloadingNULL(String s){
		System.out.println("String");
	}
	
//	public T17ConstructorOverloadingNULL(Integer i){
//		System.out.println("Integer");
//	}
	
	public static void main(String[] args) {
	
		Tr17ConstructorOverloadingNULL t = new Tr17ConstructorOverloadingNULL(null); // calls more spesific one it will print String
		
	}

}
