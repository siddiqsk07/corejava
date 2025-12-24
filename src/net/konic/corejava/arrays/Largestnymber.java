package net.konic.corejava.arrays;

public class Largestnymber {
	public static void main(String[] args) {
		int[] num = new int[4];
		int largest = 0;
		num[0] = 45;
		num[1] = 22;
		num[2] = 89;
		num[3] = 10;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest);
			largest = num[i];
			System.out.println("LARGEST :" + largest);

		}

	}

}
