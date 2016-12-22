package TrickPrograms;

public class T4IncrementDecrement {

	public static void main(String[] args) {
		int i=100;
		i=i-- - --i;		
//		int y = --x;	
		System.out.println(i);
		B1 b = new B1();
		System.out.println(b.i);
		
		B1 b2 = new B1();
		System.out.println(b2.i);
	}
	
}


class A1{
	static int i = 100;
	
	static{
		
		i=i-- - --i;
		System.out.println("A1 static,i= "+i);
		
	}
	
    {
		
		i=i++ + ++i;
		System.out.println("A1 non static block ,i= "+i);
		
	}
    
    A1(){
    	System.out.println("A1 Constructor");
    }
	
}

class B1 extends A1{
	
	static{
		
		i= --i - i--;
		System.out.println("B1 static,i= "+i);
		
	}
	
    {
		
		i=++i + i++;
		System.out.println("B1 non static block ,i= "+i);
		
	}
    
    B1(){
    	System.out.println("B1 Constructor");
    }
	
}