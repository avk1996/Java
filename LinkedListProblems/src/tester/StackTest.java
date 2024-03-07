package tester;
import static core.Stack.*;
public class StackTest {
	public static void main(String[] args) {
		displayAll();
		push(10);
		push(20);
		push(30);
		push(40);
		displayAll();
		pop();
		pop();
		pop();
		pop();
		displayAll();
	}
}
