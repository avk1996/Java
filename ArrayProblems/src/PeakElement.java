import java.util.Arrays;

//find the maximum of arrays
public class PeakElement {

	public static int findPeak(int[] array,int size) {
		int max;
		max = array[0];
		for(int i=1;i<array.length;i++) {
			if(max < array[i]) {
				max = array[i]; 
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arrayTest = new int[10];
		for(int i = 0;i<arrayTest.length ;i++) {
			arrayTest[i] = i*2;
		}
		arrayTest[0] = 4;
		arrayTest[4] = 5;
		arrayTest[1] = 10;
		arrayTest[2] = 44;
		arrayTest[5] = 25;
		arrayTest[3] = 104;
		System.out.println("Max of array amoung "+Arrays.toString(arrayTest)+" is : "+findPeak(arrayTest, arrayTest.length));		
	}

}
