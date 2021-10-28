package com.xworkz.Fish;

public class GoldFish extends Fish {
	
	public GoldFish() {
		super();
		System.out.println("invoked no arg const");
	}

	public GoldFish(String name) {
		System.out.println("invoked para const");
	}
}
