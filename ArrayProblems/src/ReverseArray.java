import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] x = {4,2,1,5,6};
		int[] newX = new int[x.length];
		int j=0;
		for(int i=x.length-1;i>=0;i--) {
			newX[i] = x[j];
			j++;
			System.out.println(i+" "+j);
		}
		System.out.println("Reversed Array: "+Arrays.toString(newX));
	}
}
