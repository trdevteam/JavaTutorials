package String.Easy;

public class EasyTutorials {

	public static void main(String[] args) {
		
		StringBuilder b = new StringBuilder("");
		
		String satir="";
		satir = satir.substring(0, satir.length()-1); //sondaki virgulu cikar
		
//		System.out.println(b.deleteCharAt(b.length()-1));
		
		b.deleteCharAt(b.length()-1);
		
		if(b.toString().equals("")){

			System.out.println(b);
		}
		
		System.out.println(b);	
		
	}
	
}
