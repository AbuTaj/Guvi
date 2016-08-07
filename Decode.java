import java.util.Scanner;

public class EncodeArray {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.next();
		String rs = "";
		String su1 = "";
		String su2 = "";
		if (s1.contains("x")) {
			int a = s1.indexOf("x") - 1;
			int b = Integer.parseInt(Character.toString(s1.charAt(a)));
			for (int i = 0; i < b - 1; i++) {
				rs += (s1.charAt(a + 2));
			}
			su1 = s1.substring(0, a);
			su2 = s1.substring(a + 2, s1.length());
			System.out.println("Decoded String : " + su1 + rs + su2);

		} else {
			System.out.println("No Key Found to Decode");
		}

	}

}
