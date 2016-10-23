package logic;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Species {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("------Species and Gene Storing-------");
		Map<String, String> ms = new TreeMap<String, String>();
		int a = s.nextInt();
		for (int i = 0; i < a; i++) {
			ms.put(s.next(), s.next());
		}
		System.out.println("------Loading Data------\n\nEnter Species to get it's gene");
		String s1 = s.next();
		if (ms.containsKey(s1)) {
			System.out.println(ms.get(s1));
		} else {
			System.out.println("No Data Found");
		}
		s.close();
	}
}
