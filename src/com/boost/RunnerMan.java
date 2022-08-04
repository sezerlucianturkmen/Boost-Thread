package com.boost;

public class RunnerMan extends Thread {

	String name;
	int distance;
	long time;

	public RunnerMan(String name) {
		super();
		this.name = name;
		this.distance = distance;
		this.time = time;
	}

	@Override
	public void run() {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			distance++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (distance % 10 == 0) {
				System.out.println("Runner " + name + " is still running and distance is ..: " + distance + " m");
			}
		}
		long stop = System.currentTimeMillis();
		time = stop - start;
		System.out.println("Run has finished and final timelab is ..: " + time);
		super.run();
	}

}
