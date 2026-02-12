package net.konic.corejava.arrays;

public class AverageOfElements {
	public static void main(String[] args) {
		int[] avg = { 10, 20, 30, 40 };
		int sum = 0;

		for (int i = 0; i < avg.length; i++) {
			sum = sum + avg[i];

			double average = (double) sum / avg.length;
			System.out.println("Average :" + average);

		}

	}

}
