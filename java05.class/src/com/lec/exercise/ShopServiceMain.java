package com.lec.exercise;

public class ShopServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShopService shopservice1 = ShopService.getInstance();
		ShopService shopservice2 = ShopService.getInstance();
		
		System.out.println(shopservice1.toString());
		System.out.println(shopservice2.toString());
		System.out.println();
		
		System.out.println(shopservice1.hashCode());
		System.out.println(shopservice2.hashCode());

	}

}
