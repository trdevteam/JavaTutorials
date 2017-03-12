package financial.collateral.evaluate.deficiency;

import java.util.HashMap;

public class DefficiencyFactory {

	public static HashMap<String, AbstractDefficiency> registry = new HashMap<>();
	
	private DefficiencyFactory(){
		registry.put("DRV", new DerivativeDefficiency());
		registry.put("SEC", new SecurityDeficiency());
	}
	
	public static AbstractDefficiency getInstance(String key){
		return registry.get(key);
	} 
	
	
	
}
