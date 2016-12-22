package TrickPrograms;

class Base{
	public String name = "Base";
}

class Derived extends Base{
	private String name1 = "Derived";
}

public class Tr15HidingSuperclassVariableMethod {
	public static void main(String[] args) {
		System.out.println(new Derived().name);
	}
}
