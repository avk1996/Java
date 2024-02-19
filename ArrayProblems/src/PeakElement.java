import java.util.Arrays;

//find the maximum of arrays
public class PeakElement {

	// find peak by initializing max to first array element then change max if the
	// current max is less than any other array element
	// time complexity O(n)
	public static int[] findPeak(int[] array, int size) {
		int max, element;
		int[] maxElement = new int[2];
		max = array[0];
		element = 0;
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				element = i;
			}
		}
		maxElement[0] = max;
		maxElement[1] = element;
		return maxElement;
	}
	
	//find peak element using binary search O(log N)

	public static void main(String[] args) {
		int[] arrayTest = new int[10];
		for (int i = 0; i < arrayTest.length; i++) {
			arrayTest[i] = i * 2;
		}
		arrayTest[0] = 4;
		arrayTest[4] = 5;
		arrayTest[1] = 10;
		arrayTest[2] = 44;
		arrayTest[5] = 25;
		arrayTest[3] = 104;
		System.out.println("Max of array amoung " + Arrays.toString(arrayTest) + " is : "
				+ findPeak(arrayTest, arrayTest.length)[0] + " at position: "
				+ findPeak(arrayTest, arrayTest.length)[1]);
	}

}
