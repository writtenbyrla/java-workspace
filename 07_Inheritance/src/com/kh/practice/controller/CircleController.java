package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {
	Circle c = new Circle();
	
	// 면적: PI * 반지름 * 반지름
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.draw() + " / " + Math.PI * radius * radius;
	}
	
	// 둘레: PI * 반지름 * 2
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.draw() + " / " + Math.PI * radius * 2;
	}
	
	
}
