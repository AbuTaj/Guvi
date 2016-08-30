package logic;

import java.util.Scanner;

public class CaseSensitive {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String s1 = s.nextLine();
		String sr[] = s1.split(" ");
		System.out.println(sr.length);
		String rs1 = "";
		String rs2 = "";
		for (int i = 0; i < sr.length; i++) {
			for (int j = 0; j < sr[i].length(); j++) {
				StringBuffer sb = new StringBuffer(sr[i]);
				String ss = sb.reverse().toString();
				if (Character.isUpperCase(sr[i].charAt(j))) {
					rs1 += Character.toUpperCase(ss.charAt(j));
				}
				if (Character.isLowerCase(sr[i].charAt(j))) {
					rs1 += Character.toLowerCase(ss.charAt(j));
				}
			}
			rs1 += " ";
			rs2 = rs1;
		}
		System.out.println(rs2);

	}

}
