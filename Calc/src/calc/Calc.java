package calc;

public class Calc {

	static String userExpression;
	static String answer;

	public static void main(String[] args) throws Exception {

		try {
			userExpression = InputExpression.inputExpression();

			ReadUserExpression result = new ReadUserExpression(userExpression);
			
			answer = ArithmeticOperation.arithmeticOperation(result.firstNumberInt, result.sign, result.secondNumberInt, result.isRomeNumber);
			
			System.out.println(answer);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			//System.exit(1);
		}

	}

}
