package puzzle_questions;

public class ClassW {

	static int c = 0;
	public static void main(String[] args) {
		ClassW w1 = c(); 
		ClassW w2 = c(w1);
		ClassW w3 = c(w2);
		ClassW w4 = c(w3);

	}
	private ClassW() {
		System.out.println("c: "+c);
	}
	static ClassW c() {
		return c++ <= 0 ? new ClassW():null;
	}
	static ClassW c(ClassW w) {
		return w.c++ == 1 ? new ClassW():null;
	}

}
