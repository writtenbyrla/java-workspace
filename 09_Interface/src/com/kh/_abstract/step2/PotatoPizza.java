package com.kh._abstract.step2;

public class PotatoPizza extends Pizza  {

	public PotatoPizza(int price, String storeName) {
//		super(price, storeName);
		this.price= price; // 부모 클래스에서 protected로 지정했기 때문에 this 형태로도 사용 가능
		this.storeName = storeName;
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping...");
	}

}
