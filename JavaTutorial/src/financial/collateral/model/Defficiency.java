package financial.collateral.model;

import java.util.Currency;

import financial.collateral.database.DeficiencyDB;
import financial.collateral.model.MTM;

public class Defficiency{

	private DeficiencyDB db; 
	
	private MTM mtmNode;
	
	private long groupCustomerOid;

	private String deficiencyCurrencyCode;
	
	private Currency deficiencyAmount;
	
	private Currency independentAmount;
	
	private Currency bankTresholdAmount;
	
	private Currency counteryPartyTresholdAmount;
	
	public DeficiencyDB getDb() {
		return db;
	}

	public void setDb(DeficiencyDB db) {
		this.db = db;
	}

	public MTM getMtmNode() {
		return mtmNode;
	}

	public void setMtmNode(MTM mtmNode) {
		this.mtmNode = mtmNode;
	}

	public long getGroupCustomerOid() {
		return groupCustomerOid;
	}

	public void setGroupCustomerOid(long groupCustomerOid) {
		this.groupCustomerOid = groupCustomerOid;
	}

	public String getDeficiencyCurrencyCode() {
		return deficiencyCurrencyCode;
	}

	public void setDeficiencyCurrencyCode(String deficiencyCurrencyCode) {
		this.deficiencyCurrencyCode = deficiencyCurrencyCode;
	}

	public Currency getDeficiencyAmount() {
		return deficiencyAmount;
	}

	public void setDeficiencyAmount(Currency deficiencyAmount) {
		this.deficiencyAmount = deficiencyAmount;
	}

	public Currency getIndependentAmount() {
		return independentAmount;
	}

	public void setIndependentAmount(Currency independentAmount) {
		this.independentAmount = independentAmount;
	}

	public Currency getBankTresholdAmount() {
		return bankTresholdAmount;
	}

	public void setBankTresholdAmount(Currency bankTresholdAmount) {
		this.bankTresholdAmount = bankTresholdAmount;
	}

	public Currency getCounteryPartyTresholdAmount() {
		return counteryPartyTresholdAmount;
	}

	public void setCounteryPartyTresholdAmount(Currency counteryPartyTresholdAmount) {
		this.counteryPartyTresholdAmount = counteryPartyTresholdAmount;
	}
	
}
