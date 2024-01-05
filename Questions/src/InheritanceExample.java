
interface A{}
class B{}
class C extends B{}
class D extends C implements A{}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		System.out.println("Hello world");
		if(d instanceof A)
			System.out.println("d is an instance of A");
		if(d instanceof C)
			System.out.println("d is an instance of C");

	}

}
