package com.telusko.SpringDemo0;

public class Alien {
	
	private int age;
	
	private Laptop laptop;
	
//	public Alien() {
//		System.out.println("Alien Object Created");
//	}
	
	public void code() {
		System.out.println("I am Coding...!");
		laptop.compile();
	}

	public Alien(int age) {
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the laptop
	 */
	public Laptop getLaptop() {
		return laptop;
	}

	/**
	 * @param laptop the laptop to set
	 */
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
}
