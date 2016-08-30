package Logic;

import java.util.Scanner;

public class MakeSquare {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		String s1 = s.next();
		String sr[] = s1.split(",");
		boolean f = false;
		if (sr.length == 8) {
			if (sr[0].equals(sr[2]) && sr[4].equals(sr[6]) && sr[1].equals(sr[7]) && sr[3].equals(sr[5])) {
				f = true;
			}
		}
		if (f) {
			System.out.println("Possible to Make");

		} else {
			System.out.println("Not Possible");
		}

	}
}
