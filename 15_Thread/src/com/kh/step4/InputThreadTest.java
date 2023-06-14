package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {
		
		Thread t = new Thread(new CountingThread());
		t.start();
		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요.");
		System.out.println("입력하신 숫자는 " + input + "입니다.");
		
		
//		InputThread it = new InputThread();
//		InputThread2 it2 = new InputThread2();
//		
//		Thread itThread = new Thread(it, "InputThread");
//		Thread it2Thread = new Thread(it2, "InputThread2");
//
//		itThread.start();
//		it2Thread.start();
		
	}
}

class CountingThread implements Runnable{

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(i);
	}
		
	}
	
}
