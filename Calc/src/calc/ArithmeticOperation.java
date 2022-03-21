package calc;

public class ArithmeticOperation {

	static int answer = 0;
	static String answerString;

	public static String arithmeticOperation(int firstNumber, String sign, int secondNumber, boolean isRomeNumber)
			throws Exception {

		if (sign.equals("+")) {
			answer = firstNumber + secondNumber;
		} else if (sign.equals("-")) {
			answer = firstNumber - secondNumber;
		} else if (sign.equals("*")) {
			answer = firstNumber * secondNumber;
		} else if (sign.equals(":")) {
			try {
				answer = firstNumber / secondNumber;
			} catch (ArithmeticException e) {
				throw new Exception("Can't divide by zero");
			}
		}
		answerString = Integer.toString(answer);

		if (isRomeNumber) {
			if (answer < 1) {
				throw new Exception("Answer in roman numerals is out of range!");
			} else {
				answerString = ArabicToRoman.arabicToRoman(answer);

			}

		}

		return answerString;
	}

}
