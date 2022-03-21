package calc;

import java.util.List;

public class RomanToArabic {

	public static int romanToArabic(String string) throws Exception {

		String romanNum = string;
		int result = 0;
		
		if (string.contains("IIII") | string.contains("VV") | string.contains("XXXX")) {
			throw new Exception ();
		}

		List<RomanNum> romanNumbers = RomanNum.getValues();

		int i = 0;

		while ((romanNum.length() > 0) && (i < romanNumbers.size())) {
			RomanNum symbol = romanNumbers.get(i);
			if (romanNum.startsWith(symbol.name())) {
				result += symbol.getValue();
				romanNum = romanNum.substring(symbol.name().length());
			} else {
				i++;
			}
		}
		
		if (romanNum.length() > 0) {
			throw new Exception ("Can't convert to arabic");
		}

		return result;
	}
}
