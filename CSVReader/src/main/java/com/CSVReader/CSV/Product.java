package com.CSVReader.CSV;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private Integer pid;
	private String pName;
	private Double pPrize;
	
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpPrize() {
		return pPrize;
	}
	public void setpPrize(Double pPrize) {
		this.pPrize = pPrize;
	}
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", pPrize=" + pPrize + "]";
	}
	
	
}
