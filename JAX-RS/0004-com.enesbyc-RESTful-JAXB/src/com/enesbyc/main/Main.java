package com.enesbyc.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.enesbyc.model.Product;
public class Main {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8080/0004-com.enesbyc-RESTful-JAXB/rest/product/info");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			// Adrese istekte bulundugunda xml alacagini belirtiyor.
			conn.setRequestProperty("Accept", "application/xml");
			//Okuma islemi yapiliyor.
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//Okunan veriler sonuc deðiskeni içerisine atiliyor.
			//Sonuc içerisinde string halde tutuluyor.
			String sonuc = br.readLine();
			System.out.println("XML tipindeki sonuc:"+sonuc);
			conn.disconnect();
			// JAXB Xmldeki bilgileri java tarafinda karsilar.
			// Tutulan nesneleri Product tipinde olacagini belirtiyor.
			JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
			// XML'deki veriyi parçalar.
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			// XML'deki veriler Product sinifina çevriliyor..
			Product product = (Product) unmarshaller.unmarshal(new StringReader(sonuc));
			//XML formatindaki veriler product tipinde yazdiriliyor.
			System.out.println("Product sinifi tipindeki sonuc:"+product);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




