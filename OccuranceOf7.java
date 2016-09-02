package logic;

import java.util.Scanner;

public class OccuranceOf7 {
	static int count = 0;

	public static int fun(int a) {
		if (a > 0) {
			if (a % 10 == 7) {
				count++;
			}
			a /= 10;
			fun(a);
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(fun(s.nextInt()));
		s.close();

	}
}
