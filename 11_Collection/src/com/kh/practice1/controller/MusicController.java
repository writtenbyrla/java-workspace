package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {
	private ArrayList<Music> list = new ArrayList();
	
	// 마지막 위치에 곡 추가
	public boolean addList(Music music) {
		// title, artist
		return list.add(music);
	}
	
	// 첫 위치에 곡 추가
	public boolean addAtZero(Music music) {
		try {
			list.add(0,music);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	// 전체 곡 목록 출력
	public ArrayList<Music> printAll() {
		return list;
	}
	
	// 특정 곡 검색
	public Music searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().contains(title)) {
				return music;
			} 
		}
		return null;
	}
	
	// 특정 곡 삭제
	public Music removeMusic(String title) {
		
//		for(Music music : list) {
//			if(music.getTitle().equals(title)) {
//				list.remove(music);
//				return music;
//			}
//		}
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			} 
		}
	return null;
	}
	
	// 특정 곡 정보 수정
	public Music setMusic(String title, Music music) {
		
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return list.set(list.indexOf(m), music);
			}
		} return null;
		
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getTitle().contains(title)) {
//				return list.set(i, music);
//			} else {
//				return null;
//			}
//		}
//		return null;
	}
	
	
	// 곡명 오름차순 정렬
	public ArrayList<Music> ascTitle() {
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		Collections.sort(list, new TitleAscending());
		return list;
		
	}
	
	// 가수명 내림차순 정렬
	public ArrayList<Music> descArtist() {
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		Collections.sort(list, new TitleAscending().reversed());
		
		return list;
	}
}
