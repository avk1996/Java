import java.util.function.Consumer;

public class LambdaExamples {

	public static void main(String[] args) {
		Consumer<String> lambdaExpression = (s) -> {
			System.out.println("lambda expression with "+s);
		};
		String input = "Hello Lambda";
		lambdaExpression.accept(input);
	}
}
