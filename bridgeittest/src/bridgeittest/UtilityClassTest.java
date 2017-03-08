package bridgeittest;

import java.util.Arrays;
import java.util.Scanner;

public class UtilityClassTest {
		public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 1 for insertionSortInteger ");
		System.out.println("enter 2 for insertionSortString");
		System.out.println("enter 3 for bubbleSortInteger");
		System.out.println("enter 4 for bubbleSortString");
		System.out.println("enter 5 for binarySearchInteger ");
		System.out.println("enter 6 for BinarySearchString");
		System.out.println("**************************************");
		System.out.println("enter the number for which you want to perform the operation");
		int n = scn.nextInt();
		switch (n) {
		case 1:
		insertionSortInt();
		break;
		case 2:
		insertionSortString();
		break;
		case 3:
		bubbleSortInt();
		break;
		case 4:
		bubbleSortString();
		break;
		case 5:
		binarySearchInt();
		break;
		case 6:
		binarySearchString();
		break;
		default:
		System.out.println("please enter the above given number to perform the operation");
		}
		scn.close();
		}
//insertion sort for integer
private static void insertionSortInt() 
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("enter the numbers ");
			String s = scn.nextLine();
			char[] ch = s.toCharArray();
			String s1 = insertionSort1(ch);System.out.println(s1.toString());
			scn.close();
		}
private static String insertionSort1(char[] ch) 
		{
			for (int i = 0; i < ch.length; i++)
				for (int j = i; j > 0; j--)
					if (ch[j] < ch[j - 1]) 
		{
			char temp = ch[j];
			ch[j] = ch[j - 1];
			ch[j - 1] = temp;
		}
		return new String(ch);
		}
//insertion sort for string
private static void insertionSortString()
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("enter the String");
			String s = scn.nextLine();
			char[] ch = s.toCharArray();
			String s1 = insertionSort(ch);
			System.out.println(s1);
			scn.close();
		}
		
private static String insertionSort(char[] ch)
		{
			for (int i = 0; i < ch.length; i++)
				for (int j = i; j > 0; j--)
					if (ch[j] < ch[j - 1]) 
					{
						char temp = ch[j];
						ch[j] = ch[j - 1];
						ch[j - 1] = temp;
					}
			return new String(ch);
		}
//bubble sort for string
private static void bubbleSortString()
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("enter the string");
			String nu = scn.nextLine();
			char[] num = nu.toCharArray();
			char temp;
			for (int m = 0; m < num.length - 1; m++) 
			{
				for (int i = 0; i < num.length - 1 - m; i++) 
				{
					if (num[i] > num[i + 1]) 
					{
						temp = num[i];
						num[i] = num[i + 1];
						num[i + 1] = temp;
					}
				}
		}
			System.out.println(Arrays.toString(num));
			scn.close();
		}
//bubble sort for integer
private static void bubbleSortInt() 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scn.nextInt();
		int[] num = new int[n];
		System.out.println("enter" + " " + n + "elements");
		for (int i = 0; i < num.length; i++)
		{
			num[i] = scn.nextInt();
		}
		int temp;
		for (int m = 0; m < num.length - 1; m++) 
		{
			for (int i = 0; i < num.length - 1 - m; i++)
			{
				if (num[i] > num[i + 1])
				{
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}
			System.out.println(Arrays.toString(num));
			scn.close();
		}
//binary search for integer
private static void binarySearchInt() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("enter" + " " + n + "elements");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		System.out.println("enter the value that you have to search");
		int b = scn.nextInt();
		Arrays.sort(a);
		int first = 0;
		int last = a.length - 1;
		while (first <= last) 
		{
		int mid = (first + last) / 2;
		if (a[mid] == b)
		{
			System.out.println("the index of search value\t" +mid);
		break;
		} 
		else if (b > a[mid])
			first = mid + 1;
		else
			last = mid - 1;
		}
		System.out.println(Arrays.toString(a));
		scn.close();
		}
//binary search for string
public static void binarySearchString() {
		Scanner scn = new Scanner(System.in);
			System.out.println("enter the String");
		String s = scn.nextLine();
		char[] ch = s.toCharArray();
			System.out.println("enter the single character that you have to search");
		String s2 = scn.nextLine();
		char[] ch3 = s2.toCharArray();
		int b = ch3[0];
		char[] a = bubbleSortString1(ch);
		System.out.println(Arrays.toString(a));
		int first = 0;
		int last = a.length - 1;
		while (first <= last) 
		{
			int mid = (first + last) / 2;
			if (a[mid] == b)
			{
				System.out.println("the mid value is the search value\t" + mid + " and the String is" + " " + s2);
				break;
			} 
		else if (b > a[mid])
			first = mid + 1;
		else
				last = mid - 1;
		}
		scn.close();
	}
private static char[] bubbleSortString1(char[] num) {
		char temp;
		for (int m = 0; m < num.length - 1; m++)
		{
			for (int i = 0; i < num.length - 1 - m; i++) 
			{
				if (num[i] > num[i + 1]) 
				{
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}
			return num;
	}
}
