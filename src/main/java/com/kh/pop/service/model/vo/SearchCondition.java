package com.kh.pop.service.model.vo;

public class SearchCondition {
	private String kname;
	private String inumber1;
	private String gender;
	private String annual;
	private String address2;
	
	public SearchCondition() {}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public String getInumber1() {
		return inumber1;
	}

	public void setInumber1(String inumber1) {
		this.inumber1 = inumber1;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAnnual() {
		return annual;
	}

	public void setAnnual(String annual) {
		this.annual = annual;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "SearchCondition [kname=" + kname + ", inumber1=" + inumber1 + ", gender=" + gender + ", annual="
				+ annual + ", address2=" + address2 + "]";
	}

	

	
	
	
	
	

}
