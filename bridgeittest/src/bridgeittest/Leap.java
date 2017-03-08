package bridgeittest;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leap;
		//int no;
		System.out.println("Enter the year:");
		Scanner scan=new Scanner(System.in);
		leap=scan.nextInt();
		if(leap%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap");
		}
		scan.close();
	}

}
