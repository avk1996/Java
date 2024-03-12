package maps;

import java.util.HashMap;

public class TestHashMaps {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10; i++) {
			hm.put(i + 1, i * 2);
		}
		for (int i : hm.keySet()) {
			System.out.println(i);
		}
	}
}
