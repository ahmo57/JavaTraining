package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "lenovo", 15000, "Çok uygun fiyat"); //referans oluşturma;
		
		Product product2 = new Product(); //referans oluşturma;
		product2.id=2;
		product2.name="Asus";
		product2.unitPrice=4550;
		product2.detail="8GB Ram";
		
		Product product3 = new Product(); //referans olusturma;
		product3.id=1;
		product3.name="Apple";
		product3.unitPrice=5550;
		product3.detail="32GB Ram";
		
		Product[] products= {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println(product.name);
		
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Pc";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "mouse";
		
		Category[] categories = {category1,category2};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCard(product1);
		productManager.addToCard(product2);
		
		int sayi1=topla(34,14);
		System.out.println(sayi1);

	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}

}
