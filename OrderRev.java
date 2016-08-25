import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrderRev {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		String sr[] = s1.split(" ");
		Arrays.sort(sr, Collections.reverseOrder());
		System.out.print("Reversed String : ");
		for (String ss : sr) {
			System.out.print(ss + " ");
		}

	}

}
