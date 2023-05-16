package com.lec.exercise;

public class ShopService {
	
	private ShopService() {}
	
	private static ShopService shopservice = new ShopService();
	
	static ShopService getInstance() {
		return shopservice;
	}

}
