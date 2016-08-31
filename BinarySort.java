package logic;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		s.close();
		String sr[] = s1.split(",");
		byte b[] = new byte[sr.length];
		for (int i = 0; i < sr.length; i++) {
			b[i] = Byte.parseByte(sr[i]);
		}
		Arrays.sort(b);

		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
	}

}
