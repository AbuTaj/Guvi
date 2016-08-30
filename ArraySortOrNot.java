package Logic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String sr[] = s1.split(",");
		String sar[] = s1.split(",");
		Arrays.sort(sr);
		boolean f = false;
		for (int i = sar.length - 1; i >= 0; i--) {
			f = false;
			if (sar[i].equals(sr[i])) {
				f = true;
			}

		}
		if (f) {
			System.out.println("Sorted");
		} else {
			System.out.println("Not Sorted");
		}
		s.close();
	}

}
