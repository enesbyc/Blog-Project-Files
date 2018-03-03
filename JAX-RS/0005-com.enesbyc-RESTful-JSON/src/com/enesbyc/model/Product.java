package com.enesbyc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//XML formati kullancagimizi belirtiyoruz.
//Product isminde bir xml olusturulmus oluyor.
//Bu sinif üzerinden xml islemlerimizi artik yapabiliriz.
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Product {
	
	//XML içerisindeki property olarak düsünebiliriz.
	//product içerisinde productName ve productPrice
	//alanlarini xml tipinde olusturuyoruz.

	@XmlElement
	String productName;
	@XmlElement
	String productPrice;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	

}

