import java.util.Scanner;

public class NumberWithoutLoop {

	private static Scanner s;

	public int recnum(int a) {
		System.out.println(a);
		a--;
		if (a == 0) {
			return 0;
		}

		return recnum(a);
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		NumberWithoutLoop nwl = new NumberWithoutLoop();
		nwl.recnum(s.nextInt());

	}

}
