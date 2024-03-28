package top_problems.arrays;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		int[] flowerbed = { 0, 0, 1, 0, 1 };
		int n = 1;

		System.out.println("Can flowerbed : " + canPlaceFlowers(flowerbed, n));
		System.out.println("Can flowerbed : " + canPlaceFlowersBetter(flowerbed, n));
	}

	private static boolean canPlaceFlowers(int[] flowerbed, int n) {

		if (n == 0)
			return true;

		for (int i = 0; i < flowerbed.length; i++) {
			// check using three pointers
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				// center //prev //next
				flowerbed[i] = 1;
				n--;
				if (n == 0)
					return true;
			}

		}

		return false;
	}

}
