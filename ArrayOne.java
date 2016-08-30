package logic;

import java.util.Scanner;

public class ArrayOne {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Array Elements seperated by Comma");
		String s1 = s.next();
		String sr[] = s1.split(",");
		String rs = "";
		boolean f = false;
		for (int i = 0; i < sr.length; i++) {
			for (int j = 1; j < sr.length; j++) {
				if (!(Integer.parseInt(sr[i]) == Integer.parseInt(sr[j]))) {
					f = true;
					rs = sr[i];
				}
			}
		}
		if (f) {
			System.out.println(rs);
		}

	}

}
