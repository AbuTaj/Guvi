
import java.util.Scanner;

public class ReverseStr {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String s1 = s.nextLine();
		String sr[] = s1.split(" ");

		for (int i = sr.length - 1; i >= 0; i--) {
			System.out.println(sr[i]);
		}

	}

}
