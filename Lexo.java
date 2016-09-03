/*Problem : Lexicographic Compare
 *Processed Only for Two Strings
 *@author : AbuTaj
 */

package logic;

import java.util.Scanner;

public class Lexo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String sr[] = { s.next(), s.next() };
		if (sr[0].compareTo(sr[1]) < 0) {
			System.out.println("Lexicographic");
		}
		if (sr[0].compareTo(sr[1]) == 0) {
			System.out.println("Equivalent");
		}
		if (sr[0].compareTo(sr[1]) > 0) {
			System.out.println("Not in Lexicographic");
		}
		s.close();

	}

}
