package logic;

import java.util.Scanner;

public class FriendPerson {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String sr[] = s1.split(",");
		String s2 = s.next();
		s.close();
		String rs = "";
		if (sr[0].equals(s2)) {
			System.out.println(sr[1] + " " + sr[2] + " " + sr[3]);
		}
		if (sr[sr.length - 1].equals(s2)) {
			System.out.println(sr[sr.length - 2] + " " + sr[sr.length - 3] + " " + sr[sr.length - 4]);
		}
		for (int i = 1; i < sr.length - 1; i++) {
			if (sr[i].equals(s2)) {
				if (i > (sr.length - 1) / 2) {
					rs += sr[i - 2] + " " + sr[i - 1] + " " + sr[i + 1];
				} else {
					rs += sr[i - 1] + " " + sr[i + 1] + " " + sr[i + 2];
				}

			}
		}
		System.out.println(rs);
	}

}
