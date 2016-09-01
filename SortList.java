package logic;

import java.util.Arrays;
import java.util.Scanner;

public class SortList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String sr1[] = s1.split(",");
		String sr2 = "";
		Arrays.sort(sr1);
		int pos = s.nextInt();
		s.close();
		for (int i = pos; i < sr1.length; i++) {
			sr2 += sr1[i] + " ";
		}
		System.out.print("First List : ");
		for (int i = 0; i < pos; i++) {
			System.out.print(sr1[i] + " ");
		}
		System.out.println();
		System.out.print("Second list : " + sr2);

	}

}
