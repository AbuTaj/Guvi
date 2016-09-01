package logic;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
