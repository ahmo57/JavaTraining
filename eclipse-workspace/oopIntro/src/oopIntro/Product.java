package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("Çalıştım");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this(); //paramteresiz olanı çalıştırır ilk olarak!!
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;

}
