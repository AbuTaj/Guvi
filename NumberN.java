package logic;

import java.util.Arrays;
import java.util.Scanner;

public class NumberN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sr = "";
		String s1 = s.next();
		char c[] = s1.toCharArray();
		Arrays.sort(c);
		for (int i = c.length - 1; i >= 0; i--) {
			if (s1.charAt(i) == c[i]) {
				sr += c[i];
			}
		}
		if (Integer.parseInt(sr) == Integer.parseInt(s1)) {
			System.out.println("Posible");
		} else {
			System.out.println("Not Possible");
		}
		s.close();

	}

}
