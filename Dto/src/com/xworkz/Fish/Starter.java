package com.xworkz.Fish;

public class Starter {

	public static void main(String[] args) {
		Fish fish=new Fish();
		System.out.println(fish.region);
		System.out.println(fish.alive);
        SharkFish fish1=new SharkFish();
        System.out.println(fish.region);
        System.out.println(fish.alive);
        GoldFish fish2=new GoldFish();
        System.out.println(fish.region);
        System.out.println(fish.alive);  
	}

}
