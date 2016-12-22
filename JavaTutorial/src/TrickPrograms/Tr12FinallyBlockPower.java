package TrickPrograms;

public class Tr12FinallyBlockPower {

	public static void main(String[] args) {
		
		System.out.println(returnSomething());
		
	}
	
	public static int returnSomething(){
		
		
		try{
			throw new RuntimeException();
		}
		catch(Exception e){
			throw e;
		}
		finally{
			return 0;
		}
		
	}
	
}
