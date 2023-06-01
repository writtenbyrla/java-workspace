package com.kh._abstract.step1;

public class BasketBall extends Sports{

	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	
	// 부모의 추상메서드 오버라이드해서 무조건 재정의해야 에러 안남 
	@Override
	public void rule() {
		System.out.println("BasketBall의 선수의 수는 " + this.numberOfPlayers + "명, 공을 던져서 링에 넣어야 한다.");
	}

}
