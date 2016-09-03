package logic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ChildrenCandies {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		System.out.println("Number of Children");
		int num = s.nextInt();
		int candies = 0;
		System.out.println("Ratings");
		for (int i = 0; i < num; i++) {
			map.put(i, s.nextInt());
		}
		candies += map.size();
		for (int i = 0; i < map.size(); i++) {
			for (int j = 1; j < map.size(); j++) {
				if (map.get(i) < map.get(j)) {
					candies += 1;
				}
			}
		}
		System.out.println("Min of " + candies + "candies");
		s.close();
	}

}
