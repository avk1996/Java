import java.util.Arrays;
import java.util.Scanner;

public class PrimerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		String str = isPrime(n)?"is prime number":"is not prime number";
		System.out.println("The number "+n+" "+str);
		
		System.out.println("enter a range for prime numbers: ");
		n = sc.nextInt();
		System.out.println("Prime numbers are: "+Arrays.toString(primeNumbers(n)));

	}

	private static long[] primeNumbers(int n) {
		long[] pNums = new long[n];
		int k = 0;
		for(int i=0;i<n;i++) {
			if(isPrime(i)) {
				pNums[k] = i;			
				k++;
			}
				
		}
		return pNums;
	}

	private static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		else if(n == 2)
			return true;
		else if(n%2==0)
			return false;
		else {
			for(int i=3;i<Math.sqrt(n);i+=2)
				if(n%i == 0)
					return false;
		}
		return true;
	}
	
}
