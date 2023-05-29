package com.kh.inheritance.parent;


// 3개의 클래스 모두 공통적으로 가지고 있는 멤버변수만 추출하여 부모 클래스를 만든다.
public class Product {
	private String brand;
	String pCode; // default는 같은 패키지 내에서 접근 가능
	protected String name;
	public int price;
	
	public Product() {
	}

	public Product(String brand, String pCode, String name, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pCode=" + pCode + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
