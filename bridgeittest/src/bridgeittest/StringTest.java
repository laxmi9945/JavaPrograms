package bridgeittest;

import java.util.Scanner;

public class StringTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your Name:");
		Scanner scan=new Scanner(System.in);
		String Username=scan.nextLine();            
		int len=Username.length();

		if(len>=3)
		{
			System.out.println("Hello "+Username+", How are you?");
		}
		else
		{
			System.out.println("Invalid Name");
		}
		scan.close();
	}

}
