package net.konic.corejava.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class CheckEmployeeExist {
	public static void main(String[] args) {
		Map<Integer, EmployeeLinkedHashMap2> map = new LinkedHashMap();
		map.put(101, new EmployeeLinkedHashMap2(101, "Ayaan"));
		map.put(102, new EmployeeLinkedHashMap2(102, "Rahim"));
		map.put(102, new EmployeeLinkedHashMap2(102, "Rahim Khan"));
		map.put(103, new EmployeeLinkedHashMap2(103, "Sara"));

		if(map.containsKey(104)) {
			System.out.println("Employee Found");
		}else {
			System.out.println("Student Not Found");
		}

	}


}
