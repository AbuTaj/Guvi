import java.util.Scanner;

class RevStr {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuffer sb = new StringBuffer(s.next());
		System.out.println("The reversed string is  " + sb.reverse());
	}
}
