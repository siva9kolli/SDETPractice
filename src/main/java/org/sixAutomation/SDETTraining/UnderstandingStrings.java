package org.sixAutomation.SDETTraining;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class UnderstandingStrings {

	// @Test
	public void stringsInitialization() {
		String s = "India";

		s = "I love " + s;

		System.out.println("s value = " + s);

		String s1 = "India";
		String s2 = new String("India");
		String s3 = "India";

		// == refers type of the variable
		if (s1 == s3) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// equals refer content
		if (s1.equals(s2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	// @Test
	public void howToReverseAString() {
		String str = "Programming";

		char chr[] = str.toCharArray();

		String reverse = "";
		System.out.println("chr.length === " + chr.length);
		for (int i = chr.length - 1; i >= 0; i--) {
			reverse = reverse + chr[i];

		}
		System.out.println("reverse === " + reverse);
	}

	// @Test
	public void reverseAString() {
		String str = "Programming";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			System.out.println("reverse === " + reverse);
		}

		System.out.println("reverse without char array === " + reverse);
	}

	// @Test
	public void findDuplicatesInAString() {
		String str = "Programming";
		char ch[] = str.toCharArray();
		int counter = 0;

		for (int i = 0; i >= ch.length; i++) {
			counter = 1;
			for (int j = i + 1; j >= ch.length; j++) {

				if (ch[i] == ch[j]) {
					counter++;
					System.out.println("Duplicates === " + ch[j]);
				}
			}

		}
	}

	@Test
	public void findDups() {
		String s = "Programmingg";
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		char chr[] = s.toCharArray();
		
		for (Character c : chr) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		System.out.println("charCount === " + charCount);
	}

}
