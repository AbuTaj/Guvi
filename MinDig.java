package logic;

import java.util.Arrays;
import java.util.Scanner;

public class MinDig {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String s1 = s.next();
		String sr = "";
		String rs = "";
		int a = s.nextInt();
		for (int i = 0; i < s1.length(); i++) {
			sr += s1.charAt(i) + " ";
		}
		String sar[] = sr.split(" ");
		Arrays.sort(sar);
		for (int i = 0; i < sar.length; i++) {
			rs += sar[i];
		}
		StringBuffer sb = new StringBuffer(rs);
		for (int i = a; i > 0; i--) {
			sb.deleteCharAt(sb.length() - 1);
		}
		System.out.println(sb);

	}
}
