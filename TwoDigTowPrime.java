package logic;

import java.util.Scanner;

public class TwoDigTowPrime {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int a = s.nextInt();
		String sr = "";
		boolean f = false;
		int pr[] = { 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
				67, 71, 73, 79, 83, 89, 97 };
		for (int i = 0; i < pr.length; i++) {
			for (int j = 1; j < pr.length; j++) {
				if (a == (pr[i] + pr[j])) {
					f = true;
					sr = pr[i] + " & " + pr[j];
				}
			}
		}
		if (f) {
			System.out.println(sr);
		} else {
			System.out.println("No Match Found");
		}
	}

}
