package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
 
	Scanner sc = new Scanner(System.in);
	
	
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5  
        4 
        3 
        2 
        1 
     */
    public void method1() {
    	System.out.print("숫자 입력 : ");
    	int number = sc.nextInt();
    	
    	for(int i = number; i>0; i--) {
    		System.out.println(i);
    	}
    }

    
    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
    /*
     * i=1, 1
     * i=2, -2
     * i=3, 3
     * i=4, -4
     */
    public void method2() {
    	
    	int sum = 0;
    	int num = 0;
    	
    	for(int i = 1; ;i++) {
    		if(i%2==1) {
    			num = i;
    			sum += num;
    		} else {
    			num = -i;
    			sum += num;
    		}
    		
    		if(sum >= 100) {
    			System.out.println(i);
    			break;
    		}
    	}
    }

    
    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 
        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3
    */
    public void method3() {
    	System.out.print("문자열 : ");
    	String str = sc.next();
    	
    	System.out.print("문자 : ");
    	char ch = sc.next().charAt(0);
    	
    	int num = 0; // 문자 개수
    	
    	for(int i=0; i<str.length(); i++) {
    		char a = str.charAt(i); // 문자열의 i번째 문자
    		
    		if(a == ch) { // 일치하면 1씩 카운트
    			num+=1;
    		} 
    	}
    	System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + num );
    }

    
    
    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용!)
        7 
        3
        4
        2
        3
        4
        0
     */
    public void method4() {
    	for(int i = 0; ;i++) {
    		double random = Math.random();
    		random = Math.random()*11;

    		int num = (int)random;

    		System.out.println(num);

    		if(num == 0) break;
    	}
    }
    	
    	
    	

    /*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)
        1 : 3 
        2 : 2 
        3 : 1 
        4 : 0 
        5 : 4 
        6 : 0 
     */
    public void method5() {

    	// 배열 이용
    	int[] counts = new int[6];
        for (int i = 0; i < 10; i++) {
            int randomValue = (int) (Math.random() * 6) + 1;
            counts[randomValue - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + " : " + counts[i]);
        }
    	
    	
    	int sum1 = 0;
    	int sum2 = 0;
    	int sum3 = 0;
    	int sum4 = 0;
    	int sum5 = 0;
    	int sum6 = 0;

    	for(int i=1; i<=10; i++) {
    		double random = Math.random();
    		random = Math.random()*6+1;
    		int num = (int)random;


    		if(num==1) {
    			sum1 += 1;
    		}else if(num==2) {
    			sum2 += 1;
    		}else if(num==3) {
    			sum3 += 1;
    		}else if(num==4) {
    			sum4 += 1;
    		}else if(num==5) {
    			sum5 += 1;
    		}else {
    			sum6 += 1;
    		}

    	System.out.println("1 : " + sum1);
    	System.out.println("2 : " + sum2);
    	System.out.println("3 : " + sum3);
    	System.out.println("4 : " + sum4);
    	System.out.println("5 : " + sum5);
    	System.out.println("6 : " + sum6);
    	}  	
    }

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
    
    public void method6() {

    	//문자열: 사용자(user1) 컴퓨터(com1)
    	//숫자: 사용자(user2) 컴퓨터(com2)

    	System.out.print("당신의 이름을 입력해주세요 : ");
    	String name = sc.next();

    	String com1 = "";
    	int sum1 = 0; // 비긴 횟수
    	int sum2 = 0; // 진 횟수
    	int sum3 = 0; // 이긴 횟수
    	
    	for(int i=0;;i++) {
    		System.out.print("가위바위보 : ");
    		String user1 = sc.next();

    		//컴퓨터 랜덤 수(com2)
    		double random = (Math.random()*3)+1;
    		int com2 = (int)random;

    		// 컴퓨터 랜덤 수 문자열로 변환(com1)
    		switch(com2) {
    		case 1: 
    			com1="가위";
    			break;
    		case 2: 
    			com1="바위";
    			break;
    		case 3:
    			com1="보";
    			break;
    		}

    		// 사용자 입력 숫자로 변환(user2)
    		int user2 = 0;
    		switch(user1) {
    		case "가위" :
    			user2 = 1;
    			break;
    		case "바위" :
    			user2 = 2;
    			break;
    		case "보" :
    			user2 = 3;
    			break;
    		}

    		System.out.println(name + " : " + user1);
    		System.out.println("컴퓨터 : " + com1);

    		int result = user2 - com2;

    		if(result==0){
    			System.out.println("비겼습니다.");
    			sum1 += 1;
    		} else if((result==-1)||(result==2)) {
    			System.out.println("졌습니다 ㅠㅠ");
    			sum2 += 1;
    		} else {
    			System.out.println("이겼습니다 !");
    			sum3 += 1;
    			break;
    		}
    		System.out.println();
    	}
    	System.out.println("이긴 횟수 : " + sum3); 
    	System.out.println("비긴 횟수 : " + sum1); 
    	System.out.println("진 횟수 : " + sum2);
    }

    public static void main(String [] args) {
    	LoopPractice lp = new LoopPractice();
//    	lp.method1();
//    	lp.method2();
//    	lp.method3();
//    	lp.method4();
//    	lp.method5();
    	lp.method6();
    	
    }

}