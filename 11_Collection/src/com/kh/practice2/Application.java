package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Application  {

	public static void main(String[] args) {
		
		// HashSet 또는 TreeSet(정렬) 사용
		// 로또 번호: 1번만! 6개 번호가 무작위
		// 내 번호: 랜덤으로 6개 번호
		// 로또번호랑 일치할 때 까지 -> equals()
		
		Application ap = new Application();
//		ap.method1();
		ap.method2();
	}
		
	//TreeSet
	public void method1() {
		Set<Integer> lotto = new TreeSet<>(); // 로또번호
		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}

		int count = 0;
		while(true){
			Set<Integer> myLotto = new TreeSet<>(); // 내 번호

			// 내 번호가 랜덤 6개 숫자 추출
			while(myLotto.size()<6) {
				int random = (int)(Math.random()*45)+1;
				myLotto.add(random);
			}

			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호: " + myLotto);
			count++;
			// 내 번호랑 로또 번호가 일치한지(equals) 

			if(lotto.equals(myLotto)) {
				System.out.println("횟수 : " + count);	
				break;
			} 
		}
	}
		
	//HashSet
	public void method2() {
		HashSet<Integer> lotto = new HashSet<>();

		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}

		List lottoList = new ArrayList(lotto);
		Collections.sort(lottoList);

		int count = 0;
		while(true) {
			HashSet<Integer> myLotto = new HashSet<>();

			while(myLotto.size()<6) {
				int random = (int)(Math.random()*45)+1;
				myLotto.add(random);
			}

			List myLottoList = new ArrayList(myLotto);
			Collections.sort(myLottoList);

			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호: " + myLotto);
			count++;
			// 내 번호랑 로또 번호가 일치한지(equals) 

			if(lottoList.equals(myLottoList)) {
				System.out.println("횟수 : " + count);	
				break;
			}
		}
	}
}
