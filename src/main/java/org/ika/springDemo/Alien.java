package org.ika.springDemo;

public class Alien {
	
//	public Alien() {
//		System.out.println("Object created");
//	}
	
	public Laptop laptop;
	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public Alien(int age, Laptop laptop) {
		this.age = age;
		this.laptop = laptop;
	}

	public void compile() {
		System.out.println("I am coding...");
		laptop.compile();
	}

}
