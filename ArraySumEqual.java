import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySumTar {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Array Separeted by Comma");
		String s1 = s.next();
		System.out.println("Enter the Target Number");
		int tar = s.nextInt();
		boolean f = false;
		String sr[] = s1.split(",");
		Arrays.sort(sr, Collections.reverseOrder());
		for (int i = 0; i < sr.length - 1; i++) {
			if ((Integer.parseInt(sr[i]) + Integer.parseInt(sr[i + 1])) == tar) {
				f = true;
				break;
			}
		}
		if (f) {
			System.out.println(f);
		} else {
			System.out.println(f);
		}

	}

}
