package logic;

import java.util.Scanner;

public class StringMul {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		s.close();
		System.out.println(Long.toString((Long.parseLong(s1) * Long
				.parseLong(s2))));

	}

}
