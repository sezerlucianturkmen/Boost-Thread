package com.boost;

public class Employee extends Thread {

	String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(name + " is working now.");
			super.run();
		}
	}

}
