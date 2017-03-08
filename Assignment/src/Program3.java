import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		int i, j;
		String temp;
		Scanner scanner = new Scanner(System.in);
		String names[] = new String[5];

		System.out.print("Enter 5 items : ");
		for (i = 0; i < 5; i++) {
			names[i] = scanner.nextLine();
		}
		System.out.println("Items in Alphabetical Order:");
		for (i = 0; i < 5; i++) {
			for (j = 1; j < 5; j++) {
				if (names[j - 1].compareTo(names[j]) > 0) {
					temp = names[j - 1];
					names[j - 1] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println("List is :");
		for (i = 0; i < 5; i++) {
			System.out.println(names[i]);
		}
		scanner.close();
	}

}
