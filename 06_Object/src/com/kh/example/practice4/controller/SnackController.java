package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

public class SnackController {

	// 멤버변수 -> 보통 모델로 만들어놓은 클래스!
	Snack snack = new Snack();
	
	// 생성자
	public SnackController() {}
	
	// 메서드
	// 데이터를 setter를 이용해 저장하고 저장되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack viewSnack) {  
		
		// snack(멤버변수로 선언한)은 controller에서 만든 임시 데이터 창고
		// viewSnack(매개변수)은 Application에서 데이터를 담은 임시 데이터 창고
		
		//String kind = viewSnack.getKind();
		//snack.setKind(kind);
		snack.setKind(viewSnack.getKind()); // 매개변수 이름을 viewSnack대신 Snack으로 지정할 경우 앞에 this를 붙여서 구분해줌(this.snack.setKind)
		snack.setName(viewSnack.getName());
		snack.setFlavor(viewSnack.getFlavor());
		snack.setNumOf(viewSnack.getNumOf());
		snack.setPrice(viewSnack.getPrice());
		
		return true;
	}
	
	// controller에서 저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		return this.snack;
		//return snack;
	}
}
