package com.kh.example.practice4.model;

public class Snack {
	
	// 캡슐화 원칙에 따라 작성
	
	// 멤버 변수는 private로!
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	/*
	 * 생성자
	 * 객체 생성할 때 : Snack snack = new Snack();
	 */
	// 기본 생성자 
	public Snack() {
	}

	public Snack(String kind, String name, String flavor, int numOf, int price) { // 멤버변수를 매개변수로 명시
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}

	
	/*
	 * Getter / Setter
	 * - Getter: 멤버변수의 값을 호출하는 메서드
	 * 		public 멤버변수에서 지정한 자료형 getXXX(){
	 * 			return 멤버변수에서 지정한 자료형에 해당하는 값;
	 * 		}
	 * 
	 * - Setter: 멤버변수의 값을 변경시키는 메서드
	 * 		public void setXXX(멤버변수에서 지정한 자료형 변수명(매개변수)){ // 외부 값을 받아야 하니까 매개변수 사용
	 * 			this.변수명(멤버변수) = 변수명(매개변수);
	 * 		}
	 */
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * 모든 클래스의 가장 최상위 클래스: Object
	 * 즉, 모든 클래스는 Object 클래스를 부모 클래스로 "상속" 받아서 사용하고 있음
	 * toString은 Object가 가지고 있는 메서드
	 * 	-> 부모 클래스가 가지고 있는 메서드 사용 가능!
	 * @Override: 부모 클래스의 메서드를 재정의 하는 것!
	 */

	@Override
	public String toString() { // Object 클래스에서는 toString이 주소값 반영, 오버라이드해서 다른 형태로 출력되게 재정의함
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]";
	}

	
}
