package financial.collateral.model;

import java.util.Currency;
import java.util.Date;

import financial.collateral.database.MtmDB;

public class MTM{
	
	private long customerOid;
	
	private Currency exposureMTMAmount;
	
	private Currency buyingMTMAmount;
	
	private Currency sellingMTMAmount;
	
	private String buyingCurrencyCode;
	
	private String sellingCurrencyCode;
	
	private String mtmCurrencyCode;
	
	private Date mtmDate;
	
	private MtmDB db;

	public MtmDB getDb() {
		return db;
	}

	public void setDb(MtmDB db) {
		this.db = db;
	}

	public long getCustomerOid() {
		return customerOid;
	}

	public void setCustomerOid(long customerOid) {
		this.customerOid = customerOid;
	}

	public Currency getExposureMTMAmount() {
		return exposureMTMAmount;
	}

	public void setExposureMTMAmount(Currency exposureMTMAmount) {
		this.exposureMTMAmount = exposureMTMAmount;
	}

	public Currency getBuyingMTMAmount() {
		return buyingMTMAmount;
	}

	public void setBuyingMTMAmount(Currency buyingMTMAmount) {
		this.buyingMTMAmount = buyingMTMAmount;
	}

	public Currency getSellingMTMAmount() {
		return sellingMTMAmount;
	}

	public void setSellingMTMAmount(Currency sellingMTMAmount) {
		this.sellingMTMAmount = sellingMTMAmount;
	}

	public String getBuyingCurrencyCode() {
		return buyingCurrencyCode;
	}

	public void setBuyingCurrencyCode(String buyingCurrencyCode) {
		this.buyingCurrencyCode = buyingCurrencyCode;
	}

	public String getSellingCurrencyCode() {
		return sellingCurrencyCode;
	}

	public void setSellingCurrencyCode(String sellingCurrencyCode) {
		this.sellingCurrencyCode = sellingCurrencyCode;
	}

	public String getMtmCurrencyCode() {
		return mtmCurrencyCode;
	}

	public void setMtmCurrencyCode(String mtmCurrencyCode) {
		this.mtmCurrencyCode = mtmCurrencyCode;
	}

	public Date getMtmDate() {
		return mtmDate;
	}

	public void setMtmDate(Date mtmDate) {
		this.mtmDate = mtmDate;
	}	
	
}
