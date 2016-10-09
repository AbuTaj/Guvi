package logic;

import java.util.Scanner;

public class Pythagorean {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Number of Pythagorean to be formed");
		int a = s.nextInt();
		int adj[] = new int[a];
		int opp[] = new int[a];
		int hyp[] = new int[a];
		System.out.println("Enter Adj and Opp values");
		for (int i = 0; i < a; i++) {
			adj[i] = s.nextInt();
			opp[i] = s.nextInt();
		}
		for (int i = 0; i < a; i++) {
			hyp[i] = (int) ((Math.pow(adj[i], 2)) + Math.pow(opp[i], 2));
		}
		for (int i = 0; i < hyp.length; i++) {
			System.out.print("Pythagorean triples " + (i + 1) + ":" + "(" + adj[i] + "," + opp[i] + ","
					+ (int) Math.sqrt(hyp[i]) + ")");
			System.out.println();
		}
		s.close();
	}

}
