package bridgeittest;

import java.util.Arrays;
import java.util.Scanner;

public class Ana {
	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())

		{
			return false;
		}
		// sorting charcters
		str1 = sortCharcters(str1);
		str2 = sortCharcters(str2);
		return str1.equals(str2);
	}


//static method to sort the character
	public static String sortCharcters(String str) {
		char[] ch = str.toUpperCase().toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String str1 = sc.next();
		System.out.println("Enter the 2nd name:");
		String str2 = sc.next();

		if (isAnagram(str1, str2)) {
			System.out.println("Choice is Anagram :)");
		} else {
			System.out.println("Choice is not Anagram :(");
		}
		sc.close();
	}

}
