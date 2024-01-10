package basics;

public class TernaryExample1 {
	public static void main(String[] args) {
		int a = 5, b = 2, c = 3;
		int larg = (c > (a > b ? a : b) ? c : (a > b ? a : b));
		System.out.println("Largest of three is : "+ larg);
		
		float m;
		m = 1.4f;
//		System.out.println("Type of : "+typeof(m));
		m = (float) (m*23.44);
	}
}
