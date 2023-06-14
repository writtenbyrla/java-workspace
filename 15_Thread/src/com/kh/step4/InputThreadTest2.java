package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {

	boolean inputCheck = false;
	
	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
		
		Thread t2 = new Thread(new InputThread3(process));
		Thread t = new Thread(new CountThread(process));
		t.start();
		t2.start();
		
	}
}

class InputThread3 implements Runnable{
	InputThreadTest2 process;

	InputThread3(InputThreadTest2 process){
		this.process = process;
	}
	
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요.");
		if(input != null) {
			System.out.println("입력하신 숫자는 " + input + "입니다.");
			process.inputCheck = true;
		}
	}
	
}

class CountThread implements Runnable{

	InputThreadTest2 process;
	
	CountThread(InputThreadTest2 process){
		this.process = process;
	}
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			try {
				if(process.inputCheck) break;
				 
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		} 
		
		if(!process.inputCheck) {
			System.out.println("시간이 초과되었습니다.");
			System.exit(0);
		}
	}

}
