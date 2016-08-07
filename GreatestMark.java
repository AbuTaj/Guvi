import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListStu {
	private static Scanner s;

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		s = new Scanner(System.in);
		String rs = "";
		int val = 0;
		int m = 0;
		String s1 = "";
		String sr[];
		System.out.println("Enter the Number of Students");
		int n = s.nextInt();
		System.out.println("Enter the Details of the Students");
		for (int i = 0; i < n; i++) {
			l.add(s.next());
		}
		for (int i = 0; i < n; i++) {
			s1 = l.get(i).toString();
			sr = s1.split("#");
			m = Integer.parseInt(sr[1]) + Integer.parseInt(sr[2]) + Integer.parseInt(sr[3]);
			if (m > val) {
				val = m;
				rs = sr[0];
			}
		}
		System.out.println("Greater Mark in Total : " + rs);
	}
}
