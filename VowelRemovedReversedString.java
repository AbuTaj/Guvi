import java.util.Scanner;

public class ReverseStrRmVow {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.nextLine();
		StringBuffer sb = new StringBuffer(s1);
		String s2 = sb.reverse().toString();
		System.out.println("Reversed String : " + s2);
		char c[] = new char[s2.length()];
		c = s2.toCharArray();
		String rs = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E'
					|| c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
				c[i] = '\0';
			} else {
				rs += c[i];
			}
		}
		System.out.println("Vowels Removed Reversed String : " + rs);

	}

}
