import java.util.Scanner;

public class PrefixStart {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int count = 0;
		boolean f = false;
		System.out.println("Enter the String Seperated by Comma");
		String s1 = s.nextLine();
		String sr[] = s1.split(",");
		for (int i = 0; i < sr.length; i++) {
			if (sr[i].length() != 2) {
				if (sr[i].startsWith("10") || sr[i].startsWith("01")) {
					f = true;
					count += 1;
				}
			}
		}
		if (f) {
			System.out.println("The Array Contains --- " + count + " --- Elements starts with : 01 or 10 (Excluded)");
		} else {
			System.out.println("No Elements Found");
		}
	}
}
