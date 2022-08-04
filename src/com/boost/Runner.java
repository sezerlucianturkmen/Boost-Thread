package com.boost;

public class Runner {

	public static void main(String[] args) {
		Value value = new Value();
		value.number = 20;
		MyThread myThread = new MyThread(value);
		MyRunnable myRunnable = new MyRunnable(value);
		myThread.run();
		Thread thread = new Thread(myRunnable);
		thread.start();

		// Lambda olarkak ullanılabilir
		new Thread(() -> {
			for (int i = 0; i < 10; i++)
				System.out.println("Thread...: " + value.number);
		});

	}

}

class Value {
	int number;
}

class MyThread extends Thread {
	Value value;

	public MyThread(Value value) {
		this.value = value;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			value.number++;
			System.out.println("Thread...: " + value.number);
		}
	}
}

class MyRunnable implements Runnable {

	Value value;

	public MyRunnable(Value value) {
		this.value = value;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			value.number--;
			System.out.println("Runnable...: " + value.number);
		}
	}
}
