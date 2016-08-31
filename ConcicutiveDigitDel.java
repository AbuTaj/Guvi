package logic;

import java.util.Scanner;

public class ConcicutiveDigitDel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int rs = a;
		int temp1 = 0;
		int temp2 = 0;
		int mul = 1;
		while (a > 0) {
			temp1 = a % 10;
			a = a / 10;
			temp2 = a % 10;
			mul = mul * 10;
			if (temp1 == temp2) {
				System.out.println((rs - (temp1 * (mul / 10))));
				System.exit(0);
			}
		}
		s.close();
	}

}
