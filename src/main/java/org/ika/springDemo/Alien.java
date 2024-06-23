package org.ika.springDemo;

public class Alien {
	
	public Alien() {
		System.out.println("Object created");
	}
	
	private int age;
	
	public void compile() {
		System.out.println("I am coding...");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
