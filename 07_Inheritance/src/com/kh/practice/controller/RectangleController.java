package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;


public class RectangleController {
	Rectangle r = new Rectangle();
	
	// 면적: 너비 * 높이
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setX(width);
		
		return r.draw() + " / " + width * height;
	}
	
	// 둘레: 2 * (너비 + 높이)
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return r.draw() + " / " + 2 * (width + height);
	}
}
