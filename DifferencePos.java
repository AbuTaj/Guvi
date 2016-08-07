import java.util.Scanner;

public class DifInElePos {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Array Seperated by Comma");
		String s1 = s.next();
		int val = 0;
		int pos = 0;
		String sr[] = s1.split(",");
		for (int i = 0; i < sr.length - 1; i++) {
			for (int j = i + 1; j < sr.length; j++) {
				int a = Integer.parseInt(sr[i]) + Integer.parseInt(sr[j]);
				if (val < a) {
					val = a;
					if (Integer.parseInt(sr[i]) > Integer.parseInt(sr[j])) {
						pos = i;
					} else {
						pos = j;
					}
				}
			}
		}
		System.out.println("Largest Difference Position : " + pos);

	}

}
