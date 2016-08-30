package logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringAnalysis {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String s1 = s.nextLine();
		String sr[] = s1.split(" ");
		String rms = "";
		String longestword = "";
		int counte = 0;
		int numint = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (!(Character.isWhitespace(s1.charAt(i)))) {
				rms += s1.charAt(i);
			}
			if (s1.charAt(i) == 'e') {
				counte++;
			}
			if (Character.isDigit(s1.charAt(i))) {
				numint++;
			}
		}
		Arrays.sort(sr, Collections.reverseOrder());
		longestword = sr[0];
		System.out.println("Spaces Removed : " + rms + "\nLongest Word : "
				+ longestword + "\ne count : " + counte
				+ "\nInteger's count : " + numint + "\nNumber of Words : "
				+ sr.length);
	}

}
