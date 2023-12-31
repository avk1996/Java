package anonymous;

interface Age{
	int age = 10;
	void getAge();
}

public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		//Anonymous class	
	Age ageObj = new Age() {
		@Override
		public void getAge() {
			X mx = new X();
			mx.m = 12;
			System.out.println("My age is : "+(age+x)+" "+mx.m);
		}
	};
		
	ageObj.getAge();
	
	}

}
class X{
	public int m;
}