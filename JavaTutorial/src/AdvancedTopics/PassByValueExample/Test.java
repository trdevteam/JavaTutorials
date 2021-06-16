package AdvancedTopics.PassByValueExample;

class Balloon {

	private String color;

	public Balloon(){}
	
	public Balloon(String c){
		this.color=c;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

public class Test {

	public static void main(String[] args) {

		Balloon red = new Balloon("Red"); //memory reference 50
		Balloon blue = new Balloon("Blue"); //memory reference 100

//		Memory adress
		System.out.println(red.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(red)));
		System.out.println(blue.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(blue)));
		swap(red, blue);
		
		System.out.println(red.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(red)));
		System.out.println(blue.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(blue)));		
		
		System.out.println("red color="+red.getColor());
		System.out.println("blue color="+blue.getColor());
		
		System.out.println(blue.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(blue)));
		foo(blue);
		System.out.println(blue.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(blue)));
		System.out.println("blue color="+blue.getColor());
		
		int a = 5;
		int b= 3;
		
		System.out.println(a);
		
	}
	
	private static void change(int a,int b){
		
		int temp=0;
		temp = a;
		a=b;
		b=temp;
		System.out.println(a);
	}

	private static void foo(Balloon balloon) { //baloon=100
		balloon.setColor("Red"); //baloon=100
		balloon = new Balloon("Green"); //baloon=200
		balloon.setColor("Blue"); //baloon = 200
	}

	//Generic swap method
	public static void swap(Balloon o1, Balloon o2){
		Balloon temp = o1;
		System.out.println("redS1 color="+o1.getColor());
		System.out.println("blueS1 color="+o2.getColor());	
		o1=o2;
		o2=temp;
		
		System.out.println("redS2 color="+o1.getColor());
		System.out.println("blueS2 color="+o2.getColor());	
		
		System.out.println("redS2 adress" + o1.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(o1)));
		System.out.println("blueS3 adress" + o2.getClass().getName() + "@" +     Integer.toHexString(System.identityHashCode(o2)));
		
	}
}