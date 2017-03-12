package financial.collateral.evaluate.deficiency;

import financial.collateral.model.Defficiency;
import financial.collateral.model.MTM;

public class SecurityDeficiency extends AbstractDefficiency{

	@Override
	public Defficiency evaluate(MTM m,String deficiencyBag) {
		return super.calculate(m, deficiencyBag);
	}

}
