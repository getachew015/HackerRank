package com.hackerrank.challenges;

import java.io.Serializable;

public class ProductBean implements Serializable{
	private String prodId, prodName, prodCategory;
	double prodPrice;
	
	public ProductBean(String prodId, String prodName, String prodCategory, double prodPrice){
		this.prodCategory = prodCategory;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
	}
	
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
}
