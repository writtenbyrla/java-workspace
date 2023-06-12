package com.bookreview;

import java.util.ArrayList;
import java.util.Scanner;

import com.bookreview.controller.ReviewController;
import com.bookreview.controller.UserController;
import com.bookreview.model.Review;
import com.bookreview.model.User;

public class Application {

	private Scanner sc = new Scanner(System.in);
	UserController uc = new UserController();
	ReviewController rc = new ReviewController();
	
	
	public static void main(String[] args) {
		Application ap = new Application();
		ap.mainMenu();
	}
	
	public void mainMenu() {
		try {
			boolean check = true;
			while(check) {
				System.out.println("***** 메인 메뉴 *****");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 입력 : ");
				switch(Integer.parseInt(sc.nextLine())){
				case 1:
					signUp();
					break;
				case 2:
					login();
					break;
				case 9:
					check=false;
					System.out.println("프로그램 종료");
					break;
				default:
					throw new Exception();
				}
			}	
		} catch (Exception e) {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			mainMenu();
		}
	}
	
	public void signUp() {
		
		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String password = sc.nextLine();
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("휴대폰번호 입력: ");
		String phone = sc.nextLine();
		System.out.print("닉네임 입력: ");
		String nickName = sc.nextLine();
		System.out.print("이메일 입력: ");
		String email = sc.nextLine();
		
		
		// true값 반환 시 로그인 성공
		if(uc.signUp(id, new User(id, password, name, phone, nickName, email))){
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}
	
	public void login() {
		
		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String password = sc.nextLine();
		
		// 로그인 메서드에서 반환값 있으면 로그인 성공
		if(uc.login(id, password)!=null) {
			System.out.println(uc.login(id, password) + "님 환영합니다!");
			userMenu();
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다. 다시 입력해주세요.");
			mainMenu();
		}
	}
	
	public void userMenu() {
		try {
		boolean check = true;
		while(check) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("1. 회원 정보 수정");
			System.out.println("2. 리뷰 등록");
			System.out.println("3. 리뷰 목록 보기");
			System.out.println("4. 리뷰 수정 ");
			System.out.println("5. 리뷰 삭제");
			System.out.println("9. 메인 메뉴로 돌아가기");
			System.out.print("메뉴 번호 입력 : ");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1: 
				updateProfile();
				break;
			case 2: 
				upload();
				break;
			case 3: 
				reviewList();
				break;
			case 4: 
				updateReview();
				break;
			case 5: 
				deleteReview();
				break;
			case 9:
				mainMenu();
				break;
			default: 
				throw new Exception();
			}
		}
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			userMenu();
		}
	}
	
	// 회원 정보 수정
	public void updateProfile() {
		try {
			System.out.println("***** 수정할 정보 선택 *****");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 휴대폰번호 수정");
			System.out.println("3. 닉네임 수정");
			System.out.println("4. 회원 메뉴로 돌아가기");
			
			System.out.print("메뉴 번호 입력 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			System.out.print("아이디 입력: ");
			String id = sc.nextLine();
			
			switch(menu) {
			case 1: 
				System.out.print("현재 비밀번호 입력: ");
				String oldPw = sc.nextLine();
				System.out.print("변경할 비밀번호 입력: ");
				String newPw = sc.nextLine();
				
				if(uc.updatePassword(id, oldPw, newPw)) {
					System.out.println("비밀번호 변경에 성공하였습니다.");
				} else {
					System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
					updateProfile();
				}
				break;
			case 2:
				System.out.print("변경할 휴대폰번호 입력: ");
				uc.updatePhone(id, sc.nextLine());
				System.out.println("휴대폰번호 변경에 성공하였습니다.");
				break;
			case 3: 
				System.out.print("변경할 닉네임 입력: ");
				uc.updateNickName(id, sc.nextLine());
				System.out.println("닉네임 변경에 성공하였습니다.");
				break;
			default: 
				throw new Exception();
			}
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			updateProfile();
		}
	}
	
	// 리뷰 업로드
	public void upload() {
//	String title, String writer, String comment, Date uploadAt
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("작가 입력 : ");
		String writer = sc.nextLine();
		System.out.print("리뷰 입력 : ");
		String comment = sc.nextLine();
		System.out.print("업로드 날짜 입력 : ");
		String date = sc.nextLine(); 
		
		Review review = new Review(title, writer, comment, date);
		if(rc.upload(review)){
			System.out.println("리뷰가 등록되었습니다.");
		} else {
			System.out.println("리뷰 등록에 실패하였습니다.");
		}
	}
	
	// 리뷰 목록보기
	public void reviewList() {
		System.out.println("***** 전체 리뷰 보기*****");
		for(Review review : rc.reviewList()) {
			System.out.println(review);
		}
	}
	
	
	// 리뷰 수정
	public void updateReview() {
		System.out.print("책 제목 입력: ");
		String title = sc.nextLine();
		
		Review review = new Review();
		System.out.print("제목 수정 : ");
		review.setTitle(sc.nextLine());
		System.out.print("작가 수정 : ");
		review.setWriter(sc.nextLine());
		System.out.print("리뷰 수정 : ");
		review.setComment(sc.nextLine());
		System.out.print("업로드 날짜 : ");
		review.setUploadAt(sc.nextLine());
		
		review = rc.updateReview(title, review); 
		
		if( review != null) {
			System.out.println("리뷰가 수정되었습니다.");
		} else {
			System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			userMenu();
		}
	}
	
	// 리뷰 삭제
	public void deleteReview() {
		System.out.print("삭제할 책 입력: ");
		Review review = rc.deleteReview(sc.nextLine());

		if(review != null){
			System.out.println("리뷰가 삭제되었습니다.");
		}else {
			System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			userMenu();
		}
	}
	
}
