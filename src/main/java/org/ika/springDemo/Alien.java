package org.ika.springDemo;

public class Alien {
	
	public Alien() {
		System.out.println("Object created");
	}
	
	public Computer comp;
	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	
//	public Alien(int age, Laptop laptop) {
//		this.age = age;
//		this.laptop = laptop;
//	}

	public void compile() {
		System.out.println("I am coding...");
		comp.compile();
	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

}
