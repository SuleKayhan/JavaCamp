package oop1;
//PascalCase - İsimlendirme ////field - özellik

public class Product {
	private String name;
	// camelCase-isimlendirme
	private double unitPrice; // birim fiyatı
	private double discount; // indirim oranı
	private String imageUrl; // ürünü görsel resmi
	private int unitInStock; // ürünün stok durumu

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	// private - özel // sadece bu classta okunabilir
}
