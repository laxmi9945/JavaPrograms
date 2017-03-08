import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("enter" + " " + n + "elements");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = scn.nextInt();
		}
		System.out.println(Arrays.toString(a));
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
			System.out.println(Arrays.toString(a));
			System.out.println("the index of search value\t" +"a["+mid+"]");
		break;
		} 
		else if (b > a[mid])
			first = mid + 1;
		else
			last = mid - 1;
		}
		
		scn.close();
		}
}
