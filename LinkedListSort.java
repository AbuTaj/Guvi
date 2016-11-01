package logic;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		s.close();
		String s2[] = s1.split(",");
		LinkedList<Integer> lii = new LinkedList<Integer>();
		for (int i = 0; i < s2.length; i++) {
			lii.add(Integer.parseInt(s2[i]));
		}
		System.out.println(lii.get(lii.size() / 2));
	}

}
