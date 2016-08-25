import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CharRevWithoutRep {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String s1 = s.next();
		Set<Character> sc = new TreeSet<Character>().descendingSet();
		for (int i = 0; i < s1.length(); i++) {
			sc.add(s1.charAt(i));
		}
		System.out.println(sc.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", ""));

	}

}
