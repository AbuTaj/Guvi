import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPan {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		List<Character> lc = new LinkedList<Character>();
		System.out.println("Enter the String");
		String s1 = s.next();
		for (int i = s1.length() - 1; i >= 0; i--) {
			lc.add(s1.charAt(i));
		}
		String sr = lc.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
		if (s1.equals(sr)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
