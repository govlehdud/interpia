package com.kh.pop.service.model.vo;

import java.sql.Date;

public class SearchCondition2 {
	private String mealns;
	private String taxins;
	private String taxidt;
	private String office;
	private String edu;
	private String enter;
	private String bRegistration;
	private String receipt;
	private String recognize;
	private String payment;
	private String companion;
	/* private String datetype; */
	private Date datetype;
	
	public SearchCondition2() {}

	public String getMealns() {
		return mealns;
	}

	public void setMealns(String mealns) {
		this.mealns = mealns;
	}

	public String getTaxins() {
		return taxins;
	}

	public void setTaxins(String taxins) {
		this.taxins = taxins;
	}

	public String getTaxidt() {
		return taxidt;
	}

	public void setTaxidt(String taxidt) {
		this.taxidt = taxidt;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getEnter() {
		return enter;
	}

	public void setEnter(String enter) {
		this.enter = enter;
	}

	public String getbRegistration() {
		return bRegistration;
	}

	public void setbRegistration(String bRegistration) {
		this.bRegistration = bRegistration;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public String getRecognize() {
		return recognize;
	}

	public void setRecognize(String recognize) {
		this.recognize = recognize;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getCompanion() {
		return companion;
	}

	public void setCompanion(String companion) {
		this.companion = companion;
	}

	public Date getDatetype() {
		return datetype;
	}

	public void setDatetype(Date datetype) {
		this.datetype = datetype;
	}

	@Override
	public String toString() {
		return "SearchCondition2 [mealns=" + mealns + ", taxins=" + taxins + ", taxidt=" + taxidt + ", office=" + office
				+ ", edu=" + edu + ", enter=" + enter + ", bRegistration=" + bRegistration + ", receipt=" + receipt
				+ ", recognize=" + recognize + ", payment=" + payment + ", companion=" + companion + ", datetype="
				+ datetype + "]";
	}

	
}
