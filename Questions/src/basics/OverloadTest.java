package basics;

class Overload {
	int x;
	double y;

	void add(int a, int b) {
		x = a + b;
	}

	void add(double a, double b) {
		y = a + b;
	}

	Overload() {
		this.x = 0;
		this.y = 0;
	}
}

public class OverloadTest {
	public static void main(String[] args) {
		
		Overload obj = new Overload();
		int a = 2;
		double b = 1.2;
		
		obj.add(a,a);
		obj.add(b, b);
		
		System.out.println(obj.x+" "+obj.y);
	}
}
