package logic;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String sr[] = s1.split(",");
		List<String> ls = new ArrayList<String>();
		for (String ss : sr) {
			ls.add(ss);
		}
		s.close();
		for (int i = ls.size() - 1; i >= 0; i--) {
			System.out.print(ls.get(i) + " ");
		}

	}

}
