package net.konic.corejava.arrays;

public class SumOfArray {
	public static void main(String[] args) {

		int[] add = { 10, 20, 30, 40 };
		int sum = 0;
		for(int i = 0;i < add.length; i++) {
			sum= sum + add[i];
			System.out.println("Array :"+sum);
		}
	}
}