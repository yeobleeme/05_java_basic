package com.lec.ex03_multi;

import com.lec.ex02_implement.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	
	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("SmartTv turn on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTv turn off");
		
	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if (volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		} else {
			this.volumn = volumn;
		}
		System.out.println("현재 SmartTv 볼륨은 " + this.volumn + " 입니다.");
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + " 검색");
		
	}
	
	

}
