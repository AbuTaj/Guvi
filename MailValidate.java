import java.util.Scanner;

public class MailValidation {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		boolean f = false;
		System.out.println("Enter the Mail ID");
		String s1 = s.next();
		if (s1.contains("@") && s1.contains(".")) {
			for (int i = 0; i < s1.length() - 1; i++) {
				for (int j = i + 1; j < s1.length(); j++) {
					if ((s1.charAt(i) == '@' && s1.charAt(j) == '@') || (s1.charAt(i) == '.' && s1.charAt(j) == '.')) {
						f = false;
					}
				}
			}
			if (((s1.indexOf(".") - s1.indexOf("@")) >= 4)
					&& (s1.indexOf("@") - s1.indexOf(s1.charAt(0), s1.indexOf("@") - 1) >= 3) && s1.endsWith(".com")) {
				f = true;
			}
		}

		if (f) {
			System.out.println("Entered Id is Vaild");
		} else {
			System.out.println("Entered Id is Not Valid");
		}

	}

}
