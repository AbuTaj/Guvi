import java.util.Scanner;

public class IfSubString {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the First Array seperated by Comma");
		String s1 = s.next();
		System.out.println("Enter the Second Array Seperated by Comma");
		String s2 = s.next();
		String sr1[] = s1.split(",");
		String sr2[] = s2.split(",");
		String sr = "";
		for (int i = 0; i < sr1.length; i++) {
			for (int j = 0; j < sr2.length; j++) {
				if (Integer.parseInt(sr1[i]) == Integer.parseInt(sr2[j])) {
					sr += sr1[i] + " ";
				}
			}
		}
		System.out.println("Sub String Obtained : " + sr);

	}

}
