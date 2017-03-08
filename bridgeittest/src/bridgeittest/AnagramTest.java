package bridgeittest;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {
	public static void main(String[] args) {
		String String1, String2, srt1, srt2;
		System.out.println("enter the 1st string:");
		Scanner scan = new Scanner(System.in);
		String1 = scan.nextLine();
		System.out.println("Enter the 2nd string:");
		Scanner scan2 = new Scanner(System.in);
		String2 = scan2.nextLine();
		srt1 = String1.replaceAll("\\s", "");// removing the white spaces
		srt2 = String2.replaceAll("\\s", "");
		System.out.println(srt1);
		char[] ch1 = srt1.toUpperCase().toCharArray();
		char[] ch2 = srt2.toUpperCase().toCharArray();
		Arrays.sort(ch1); // Sorting chars
		Arrays.sort(ch2);
		System.out.println(ch1);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("not anagram");
		}
		scan.close();
		scan2.close();
	}
}
