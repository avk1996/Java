package basics;

public class CharsToString {

	public static void main(String[] args) {
		char chars[] = {'a','b','c'};
		//String allocates the array of characters to string form
		//contents of array are copied into s string 
		//further modification to chars[] will not affect s string
		String s = new String(chars);
		System.out.println(s);
		chars[0] = 'c';
		chars[2] = 'd';
	}

}
