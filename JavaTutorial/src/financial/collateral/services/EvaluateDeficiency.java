package financial.collateral.services;

import financial.collateral.evaluate.deficiency.AbstractDefficiency;
import financial.collateral.evaluate.deficiency.DefficiencyFactory;
import financial.collateral.evaluate.mtm.AbstractMTM;
import financial.collateral.evaluate.mtm.MTMFactory;
import financial.collateral.model.Defficiency;
import financial.collateral.model.MTM;

public class EvaluateDeficiency {

	public void evaluate(){
		
		String mtmBag = "";
		AbstractMTM m = MTMFactory.getInstance("FWD");
		MTM totalMTM = m.evaluate(mtmBag);		
		totalMTM.getDb().update();
		
		String deficiencyBag = "";
		AbstractDefficiency d = DefficiencyFactory.getInstance("DRV");
		Defficiency def = d.evaluate(totalMTM, deficiencyBag);
		def.getDb().update();
		
	}
	
}
