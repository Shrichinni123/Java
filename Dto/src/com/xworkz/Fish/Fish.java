package com.xworkz.Fish;

public class Fish {

	public String region="udupi";
	public boolean alive=true;
	public Fish() {
		this("test");
		System.out.println("invoked no arg const");
		}
	public Fish(String string) {
		super();
		System.out.println("invoked parameterized const");
	}
}
