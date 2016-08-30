package logic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListPro {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		List<Integer> li1 = new LinkedList<Integer>();
		List<Integer> li2 = new LinkedList<Integer>();
		System.out.println("List 1");
		String s1 = s.next();
		String sr1[] = s1.split(",");
		for (int i = 0; i < sr1.length; i++) {
			li1.add(Integer.parseInt(sr1[i]));
		}
		System.out.println("List 2");
		String s2 = s.next();
		String sr2[] = s2.split(",");
		for (int i = 0; i < sr2.length; i++) {
			li2.add(Integer.parseInt(sr2[i]));
		}
		if (li1.size() == li2.size()) {
			List<Integer> ls = new LinkedList<Integer>();
			for (int i = 0; i < li1.size(); i++) {
				ls.add(li1.get(i) + li2.get(i));
			}
			System.out.println(ls.toString().replace("[", "").replace("]", "")
					.replace(", ", ","));
		} else {
			System.out.println("Size mismatch");
		}

	}

}
