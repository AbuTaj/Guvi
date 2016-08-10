import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateFmt {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Date");
		String s1 = s.next();
		boolean f = false;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			sdf.parse(s1);
			f = true;
		} catch (ParseException e) {
			f = false;
		}
		System.out.println("Parse " + f);
	}

}
