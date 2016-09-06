package logic;

import java.util.Scanner;

public class SeedOfNum {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int temp = 0;
		int flag1 = 0;
		int flag2 = 0;
		boolean f = false;
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			flag1 = 1;
			flag2 = i;
			while (flag2 > 0) {
				temp = flag2 % 10;
				flag1 *= temp;
				flag2 /= 10;
			}
			if (flag1 * i == n) {
				f = true;
				System.out.print(i);
			}
		}
		if (!f) {
			System.out.println("No Seed Found");
		}
		s.close();

	}
}
