package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		long insertStartTime = System.nanoTime();
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(null);
		num.add(3);
		num.add(13);
		long insertEndTime = System.nanoTime();

		System.out.println("Operation Strat Time :" + insertStartTime);
		System.out.println(num);
		System.out.println("Operation End Time :" + insertEndTime);
		System.out.println(num.get(2));
		

	}

}
