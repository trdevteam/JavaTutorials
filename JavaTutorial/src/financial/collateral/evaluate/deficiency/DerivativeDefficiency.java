package financial.collateral.evaluate.deficiency;

import financial.collateral.model.Defficiency;
import financial.collateral.model.MTM;

public class DerivativeDefficiency extends AbstractDefficiency{

	@Override
	public Defficiency evaluate(MTM m,String deficiencyBag) {
		// TODO Auto-generated method stub
		return super.calculate(m, deficiencyBag);
	}

}
