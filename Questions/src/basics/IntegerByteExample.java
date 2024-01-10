package basics;

public class IntegerByteExample {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Integer i = new Integer(257);
		//conversion of size of integer given in bytes 
		byte x = i.byteValue();
		System.out.println(x);
	}

}
