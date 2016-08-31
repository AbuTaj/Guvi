package logic;

import java.util.Scanner;

public class TwosAndZeros {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String sr[] = s1.split(",");
		int count = 0;
		for (int i = 0; i < sr.length - 1; i++) {
			if (sr[i].equals("0") && sr[i + 1].equals("2")
					|| sr[i + 1].equals("2")) {
				count++;
			}

		}
		System.out.println(count);
		s.close();

	}

}
