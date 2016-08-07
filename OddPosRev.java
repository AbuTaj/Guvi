import java.util.Scanner;

public class OddPosRev {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the String to Reverse");
		String s1 = s.nextLine();
		String sr[] = s1.split(" ");
		s1 = "";
		for (int i = 0; i < sr.length; i++) {
			if (i % 2 != 0) {
				StringBuffer sb = new StringBuffer(sr[i]);
				s1 += sb.reverse().toString() + " ";
			} else {
				s1 += sr[i] + " ";
			}
		}
		System.out.println("Odd Position reversed String : " + s1);

	}

}
