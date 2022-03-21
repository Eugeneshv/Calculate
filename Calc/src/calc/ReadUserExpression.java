package calc;

public class ReadUserExpression {

	StringBuilder firstNumber = new StringBuilder();
	StringBuilder secondNumber = new StringBuilder();
	int firstNumberInt;
	int secondNumberInt;
	String sign = "";
	boolean isRomeNumber = false;

	public ReadUserExpression(String userExpression) throws Exception {

		char[] charArrayUserExpression = userExpression.replace(" ", "").toCharArray();

		if (charArrayUserExpression[0] == 'I' | charArrayUserExpression[0] == 'V' | charArrayUserExpression[0] == 'X') {
			isRomeNumber = true;
		}

		for (int i = 0; i < charArrayUserExpression.length; i++) {
			if ((charArrayUserExpression[i] == '+') | (charArrayUserExpression[i] == '-')
					| (charArrayUserExpression[i] == '*') | (charArrayUserExpression[i] == ':')
					| (charArrayUserExpression[i] == '/')) {

				try {

					for (int j = 0; j < i; j++) {
						firstNumber = firstNumber.append(charArrayUserExpression[j]);
					}

					for (int k = i + 1; k < charArrayUserExpression.length; k++) {
						secondNumber = secondNumber.append(charArrayUserExpression[k]);
					}

					if (isRomeNumber) {
						firstNumberInt = RomanToArabic.romanToArabic(firstNumber.toString());
					} else {
						firstNumberInt = Integer.parseInt(firstNumber.toString());
					}

					if (isRomeNumber) {
						secondNumberInt = RomanToArabic.romanToArabic(secondNumber.toString());
					} else {
						secondNumberInt = Integer.parseInt(secondNumber.toString());
					}

				} catch (Exception e) {
					throw new Exception("String is not a mathematical operation!");
				}

				if (firstNumberInt < 0 || firstNumberInt > 10 || secondNumberInt < 0 || secondNumberInt > 10) {
					throw new Exception("Out of range!");
				}

				if (charArrayUserExpression[i] == '+') {
					sign = "+";
				} else if (charArrayUserExpression[i] == '-') {
					sign = "-";
				} else if (charArrayUserExpression[i] == '*') {
					sign = "*";
				} else if ((charArrayUserExpression[i] == ':') | (charArrayUserExpression[i] == '/')) {
					sign = ":";
				}
			}
		}
		if (sign == "") {
			throw new Exception("The string does not contain a mathematical operation!");
		}

	}
}
