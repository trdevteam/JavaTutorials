package financial.collateral.evaluate.mtm;

import java.util.HashMap;

public class MTMFactory{

	public static HashMap<String, AbstractMTM> registryMp = new HashMap<>();

	private MTMFactory(){
		
		registryMp.put("FWD", new FwdMTM());
		
	}
	
	public static  AbstractMTM getInstance(String key){
		
		return registryMp.get(key);
		
	}
	
}
