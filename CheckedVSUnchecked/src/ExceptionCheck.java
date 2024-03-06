import java.io.IOException;
import java.io.PrintWriter;
public class ExceptionCheck {

	public static void main(String[] args) throws IOException {
		try {
			PrintWriter pw = new PrintWriter("asc.txt");
			pw.println("Hello world");
			System.out.println(10/0);
			
		}
		catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by ZERO "+e.getLocalizedMessage());
//			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
