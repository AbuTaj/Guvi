import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DulicateRemovelInStr {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		Set<String> ss = new LinkedHashSet<String>();
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		String sr[] = s1.split(" ");
		for (int i = 0; i < sr.length; i++) {
			ss.add(sr[i]);
		}
		System.out.println(
				"Dulicate removed String : " + ss.toString().replace("[", "").replace(",", "").replace("]", ""));

	}

}
