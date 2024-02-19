import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] stringArray = new String[100];
		char[] newString = string.toCharArray();
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if(newString[i]!=' ') {
				stringArray[i] = newString[count]; 
			}
		}
		sc.close();
	}
}
