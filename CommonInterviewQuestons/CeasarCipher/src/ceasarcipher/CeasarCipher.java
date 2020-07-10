package ceasarcipher;

public class CeasarCipher {

	private final int DECODE_NUM = 5;

	public String decode(String code) {

		String res = "";
		int lastCharValue = 'z';
		int alphabetLength = 'z' - 'a' + 1;
		for (char c : code.toCharArray()) {
			int charNoRotation = c + DECODE_NUM;
			int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
			res += (char) charValue;
		}

		return res;
	}
}
