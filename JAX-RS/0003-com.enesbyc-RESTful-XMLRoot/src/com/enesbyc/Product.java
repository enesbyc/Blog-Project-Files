package com.enesbyc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//XML format� kullanca��m�z� belirtiyoruz.
//Product isminde bir xml olu�turulmu� oluyor.
//Bu s�n�f �zerinden xml i�lemlerimizi art�k yapabiliriz.
@XmlRootElement
//Tiplerin �nemini belirtiyoruz.
@XmlAccessorType(XmlAccessType.NONE)
public class Product {
	
	//XML i�erisindeki propert olarak d���nebiliriz.
	//product i�erisinde productName ve productPrice
	//alanlar�n� xml tipinde olu�turuyoruz.

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


