package financial.collateral.evaluate.deficiency;

import financial.collateral.model.Defficiency;
import financial.collateral.model.MTM;
import financial.collateral.model.build.DeficiencyBuilder;

public abstract class AbstractDefficiency {

	public abstract Defficiency evaluate(MTM m,String deficiencyBag);
	
	protected Defficiency calculate(MTM m, String deficiencyBag){
	
		return new DeficiencyBuilder().build(m);
		
	}
	
}
