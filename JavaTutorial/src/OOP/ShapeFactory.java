package OOP;

public class ShapeFactory {

	public static AbstractIshape getInstance(int type){
		
		if(type==1){
			return new Cube();	
		}
		if(type==2){
			return new Cuboid();	
		}
		if(type==3){
			return new Hemisphere();	
		}
		if(type==4){
			return new Clynder();	
		}
		
		return null;
	}
	
}
