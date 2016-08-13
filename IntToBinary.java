import java.util.Scanner;

public class BinaryRep {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(Integer.toBinaryString(a));
	}

}
