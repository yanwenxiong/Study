package com.vlife.ywx.test;

import com.vlife.ywx.chapter2.DangerousCount;

public class Main {

	public static void main(String[] args) {
		final DangerousCount count = new DangerousCount();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					count.count++;
				}
 			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					if (count.count != count.count) {
						System.out.println("error occured!");
					}
				}
 			}
		});
		thread1.start();
		thread2.start();
	}

}
