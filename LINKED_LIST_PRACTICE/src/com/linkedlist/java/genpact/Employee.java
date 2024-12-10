package com.linkedlist.java.genpact;

public class Employee {
	private double sal;
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", name=" + name + ", age=" + age + "]";
	}
	public Employee(double sal, String name, int age) {
		super();
		this.sal = sal;
		this.name = name;
		this.age = age;
	}

}
