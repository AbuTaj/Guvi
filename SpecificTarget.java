import java.util.Scanner;

public class SpecificTarget {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Array Seperated by Comma");
		String s1 = s.next();
		boolean f = false;
		String st = "";
		System.out.println("Enter the Target Value");
		int tar = s.nextInt();
		String sr[] = s1.split(",");
		for (int i = 0; i < sr.length - 1; i++) {
			for (int j = i; j < sr.length; j++) {
				if ((Integer.parseInt(sr[i]) + Integer.parseInt(sr[i + 1])) == tar) {
					f = true;
					st += sr[i] + " and " + sr[i + 1];
					break;
				}
			}
		}
		if (f) {
			System.out.println("Number of Target is : " + st);
		} else {
			System.out.println("No Target Found");
		}

	}

}
