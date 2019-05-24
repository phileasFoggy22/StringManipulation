package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String longerInput = "";

		for (char s : input.toCharArray()) {
			longerInput += s;
			longerInput += s;
			longerInput += s;
		}
		return longerInput;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String backwards = "";
		int firstBert = 0;
		int secondBert = 0;
		if (input.toLowerCase().contains("bert")) {
			firstBert = input.toLowerCase().indexOf("bert");
			secondBert = input.toLowerCase().indexOf("bert", firstBert + 1);
			// backwards = input.substring(firstBert + 4, secondBert);

			char[] charInput = input.toCharArray();
			for (int i = 0; i < (secondBert - (firstBert + 4)); i++) {
				backwards += charInput[secondBert - (i + 1)];
			}

		}

		return backwards;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int diff1 = 0;
		int diff2 = 0;

		if (a < b) {

			diff1 = b - a;
		}
		if (b < c) {
			diff2 = c - b;
		} else if (c < a) {
			diff2 = a - c;
		}

		return (diff1 == diff2);
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {

		return input.substring(0, (input.length() - a) / 2)
				+ input.substring(input.length() - (input.length() - a) / 2, input.length());

	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		return input.toLowerCase().endsWith("dev");

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int biggest = 0;
		int counter = 0;
		char current;
		for (int i = 0; i < input.length(); i++) {
			current = input.charAt(i);

			if (i > 0) {
				if (input.charAt(i) == input.charAt(i - 1)) {

					counter++;
					if (counter > biggest) {
						biggest = counter;
					}
				} else {
					counter = 1;
				}

			}
		}

		return biggest;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		return 0;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		String fb = "";
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			fb = "fizzbuzz";
		} else if (arg1 % 3 == 0) {
			fb = "fizz";
		} else if (arg1 % 5 == 0) {
			fb = "buzz";
		}

		return fb;
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		return 0;

	}

}
