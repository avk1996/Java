package string_examples;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Quiz");
		StringBuffer s2 = s1.reverse();
		String s3 = "about";
		String s4 = "about";
		System.out.println("ref. equality: "+(s1==s2));
		System.out.println("ref. equality: "+(s4==s3));
		System.out.print(s2);
	}
}
