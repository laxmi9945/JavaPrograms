package bridgeittest;

import java.util.Scanner;

public class Primefactortest {
	public static void main(String[] args)
	{
		int n;
		int i=2;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		while(n>1)
		{
			if(n%i==0)
			{
				System.out.println(i+"");
				n=n/i;
			}
			else i++;
		}
	}
	

}
