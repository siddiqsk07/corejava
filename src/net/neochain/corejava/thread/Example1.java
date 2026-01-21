package net.neochain.corejava.thread;

public class Example1 implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			if (i == 4) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		}

	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		Thread thread = new Thread(example1);

		thread.start();
	}

}
