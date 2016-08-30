package logic;

import java.util.Scanner;

public class StairClaim {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Stair Count");
		int a = s.nextInt();
		int stair[] = new int[a];
		System.out.println("Enter the Stair Number");
		for (int i = 0; i < a; i++) {
			stair[i] = s.nextInt();
		}
		System.out.print("Single Combinations : ");
		for (int i : stair) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		System.out.print("Double Combinations : ");
		for (int i = 1; i < stair.length; i += 2) {
			System.out.print(stair[i] + " ");
		}
	}

}
