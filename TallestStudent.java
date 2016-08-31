package logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TallestStudent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String sr[] = s1.split(",");
		Arrays.sort(sr, Collections.reverseOrder());
		int a = s.nextInt();
		s.close();
		System.out.println(sr[a]);
	}

}
