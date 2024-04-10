package top_problems.arrays;

import java.util.Arrays;

public class HighestAltitude {

	public static void main(String[] args) {
		int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
		int maxAltitude = largestAltitude(gain);
		System.out.println("Highest altitude: " + maxAltitude);
	}

	private static int largestAltitude(int[] gain) {
		int maxAltitude = 0;
		int gained = 0;
		for (int i = 0; i < gain.length; i++) {
			gained += gain[i];
			maxAltitude = Math.max(gained, maxAltitude);
		}
		return maxAltitude;
	}

	// brute force
	private static int largestAltitudeBrute(int[] gain) {
		int[] temp = new int[gain.length + 1];
		int gained = 0;
		for (int i = 0; i < gain.length; i++) {
			temp[i] = gained;
			gained += gain[i];
		}
		temp[gain.length] = gained;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > gained)
				gained = temp[i];
		}

		System.out.println(Arrays.toString(temp));
		return gained;
	}

}
