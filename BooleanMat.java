import java.util.Scanner;

public class BooleanMat {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = s.nextInt();
		System.out.println("Enter the column");
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		int sum = 0;
		int temp = 0;
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];

			}
			if (sum >= temp) {

				temp = sum;
				count++;

			}

			sum = 0;

		}
		System.out.println("Max Number of 1's is at : " + count + "st row");
	}

}
