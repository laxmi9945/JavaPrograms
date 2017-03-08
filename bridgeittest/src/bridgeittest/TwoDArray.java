package bridgeittest;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int row = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);

		System.out.println("Enter number of columns: ");
		int col = scan2.nextInt();
		System.out.println("Enter" + row + "rows,and" + col + "colomn");
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = input.nextInt();
		System.out.println("Output is:");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}
		scan.close();
		scan2.close();
		input.close();
	}
}
