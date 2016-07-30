import java.util.Scanner;

public class WeekendOrHoliday {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Day");
		String s1 = s.next();
		s1 = s1.toLowerCase();
		if (s1.equals("sunday") || s1.equals("saturday")) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}

}
