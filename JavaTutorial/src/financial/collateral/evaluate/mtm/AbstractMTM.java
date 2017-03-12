package financial.collateral.evaluate.mtm;

import financial.collateral.model.MTM;
import financial.collateral.model.build.MTMBuilder;

public abstract class AbstractMTM {
	
	public abstract MTM evaluate(String mtmBag);
	
	protected MTM calculate(String mtmBag){
		return new MTMBuilder().build(mtmBag);
	}	
	
}
