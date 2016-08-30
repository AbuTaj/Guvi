package logic;

import java.util.Scanner;

public class TailingZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		int fact = 1;
		String sf = "";
		int zc = 0;
		for (int i = 1; i <= f; i++) {
			fact = i * fact;
		}
		sf = Integer.toString(fact);
		for (int i = sf.length() - 1; i >= 0; i--) {
			if (sf.charAt(i) == '0') {
				zc++;
			}
		}
		System.out.println("Tailing Zeros count : " + zc);
		s.close();
	}

}
