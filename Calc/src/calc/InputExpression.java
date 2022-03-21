package calc;

import java.util.Scanner;

public class InputExpression {

	public static String inputExpression() throws Exception {

		Scanner input = new Scanner(System.in);
		String userExpression = input.nextLine();
		input.close();
		
		if (userExpression.replaceAll("\\s","").equals("")) {
			throw new Exception("Expression can't be empty!");
		}
		return userExpression;
	}
}
