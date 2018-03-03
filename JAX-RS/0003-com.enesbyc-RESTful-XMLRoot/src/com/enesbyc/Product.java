package com.enesbyc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//XML formatý kullancaðýmýzý belirtiyoruz.
//Product isminde bir xml oluþturulmuþ oluyor.
//Bu sýnýf üzerinden xml iþlemlerimizi artýk yapabiliriz.
@XmlRootElement
//Tiplerin önemini belirtiyoruz.
@XmlAccessorType(XmlAccessType.NONE)
public class Product {
	
	//XML içerisindeki propert olarak düþünebiliriz.
	//product içerisinde productName ve productPrice
	//alanlarýný xml tipinde oluþturuyoruz.

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
	

}


