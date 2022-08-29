package com.kh.pop.service.model.vo;

public class SearchCondition3 {
	private String receipt;
	private String recognize;
	private String payment;
	private String companion;
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
	@Override
	public String toString() {
		return "SearchCondition3 [receipt=" + receipt + ", recognize=" + recognize + ", payment=" + payment
				+ ", companion=" + companion + "]";
	}

	
	
	
}
