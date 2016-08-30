package Logic;

import java.util.Scanner;

public class StoI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = s.next();
		System.out.println("Converted to Int : " + Integer.parseInt(s1));
		s.close();
	}

}
