package bridgeittest;

import java.util.Scanner;

public class VendingTest {	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the money for which you want the change");
		int n = scn.nextInt();
		int[] note = { 2000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int[] changenote = new int[note.length];
		int count = 0;
		int notelen = note.length;
		for (int i = 0; i < notelen; i++) {
			if (n % note[i] >= 0) {
				int var = n / note[i];
				changenote[i] = var;
				count++;
				n = n % note[i];
			}
		}
		// System.out.println(count);
		for (int j = 0; j < count; j++) {
			if (changenote[j] > 0)

				System.out.println("the number of notes are:" + " Rs" + note[j] + "=" + changenote[j] + "nos");
		}
		scn.close();
	}
}
