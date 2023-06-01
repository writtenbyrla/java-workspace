package com.kh._interface.step3;

public class Television implements RemoteControl{

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void search(String url) { // RemoteControl이 Searchable을 상속받음
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	@Override
	public void setVolume(int volume) {  // RemoteControl이 Volume을 상속받음
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
}
