package com.kh.example.practice5.controller;

import com.kh.example.practice5.model.Employee;

public class EmployeeController {
	
	// 멤버변수
	private Employee employee = new Employee();
	
	//생성자
	public EmployeeController() {}
	
	// 메서드
	
	// 데이터 저장 메소드1(기본 정보 추가)
	public void add(int empNo, String name, char gender, String phone) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
	}

	// 데이터 저장 메소드2(추가 정보 입력)
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this.add(empNo, name, gender, phone);
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBonus(bonus);
	}
	
	// 전화번호 수정 메소드
	public void modify(String phone) {
		employee.setPhone(phone);
	}
	
	// 사원 연봉 수정 메소드
	public void modify(int salary) {
		employee.setSalary(salary);
	}
	
	// 보너스율  수정 메소드
	public void modify(double bonus) {
		employee.setBonus(bonus);
	}

	public Employee info() {
		return employee;
	}
	

}
