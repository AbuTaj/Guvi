import java.util.Scanner;

public class PosValueEqual {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Array Seperated by Comma");
		String s1 = s.next();
		boolean f = false;
		int in = 0;
		int val = 0;
		String sr[] = s1.split(",");
		for (int i = 0; i < sr.length; i++) {
			if (Integer.parseInt(sr[i]) == i) {
				f = true;
				in = i;
				val = Integer.parseInt(sr[i]);
			}
		}
		if (f) {
			System.out.println("The Value Found at the Index " + in + " is " + val);
		} else {
			System.out.println("No Value Index Matches Found");
		}

	}

}
