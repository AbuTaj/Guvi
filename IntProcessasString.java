import java.util.Scanner;

public class StringMul {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the First Number as String");
		String s1 = s.next();
		int a = Integer.parseInt(s1);
		System.out.println("Enter the Second Number as String");
		String s2 = s.next();
		int b = Integer.parseInt(s2);
		int rs = a * b;
		rs = Math.abs(rs);
		System.out.println("The Multiplication of the Number is : " + Integer.toString(rs));

	}

}
