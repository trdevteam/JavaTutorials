package TrickPrograms;

class Cat{
	
	public static void meow() {
		System.out.println("meow");
	}
	
}

class Lion extends Cat{
	public static void meow() {
		System.out.println("yaown");
	}
}

public class Tr14StaticMethodsAndOverriding {
	
	public static void main(String[] args) {
		Cat kitty = new Cat();
		Cat lion = new Lion();
		kitty.meow();
		lion.meow();
	}

}
