package calc;

import java.util.List;

public class ArabicToRoman {

	public static String arabicToRoman(int number) {

		List<RomanNum> romanNumbers = RomanNum.getValues();

		int i = 0;

		StringBuilder romanString = new StringBuilder();

		while ((number > 0) && (i < romanNumbers.size())) {
			RomanNum currentSymbol = romanNumbers.get(i);
			if (currentSymbol.getValue() <= number) {
				romanString.append(currentSymbol.name());
				number -= currentSymbol.getValue();
			} else {
				i++;
			}
		}

		return romanString.toString();

	}

}
