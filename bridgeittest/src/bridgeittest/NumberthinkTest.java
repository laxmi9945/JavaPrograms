package bridgeittest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberthinkTest {
	BufferedReader br;
	public class Utility
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	}
	static int range,count,lower,upper,middle;
	//static String input;
	Utility u=new Utility();
	public int inputInteger(){
		try {
			try {
				BufferedReader br = null;
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) 
				{
				// TODO: handle exception
				System.out.println("e");
				}
			
		} catch (Exception e) 
			{
			// TODO: handle exception
			System.out.print(e);
			}
		return 0;
	}
	public  static void binarySearch(int lower,int upper,int middle,int count,String input,int n)
   	{
		
		Scanner scan=new Scanner(System.in);
		int input1=scan.nextInt();
       	do
        {
            if (input.equals("high"))
            {
				lower= middle;
				count++;
            }
			else if (input.equals("yes"))
            {
				System.out.println("The number you thought was: "+middle);
				int no=count+1;
				System.out.println("It takes "+no+" times to find your exact number");
				break;
            }
			else if(input.equals("low"))
            {
				upper=middle;
				count++;
			}
            if(count<n)
            {
				middle=(lower+ upper+1)/2;
				System.out.println("Is your number "+middle+":");
				//input1=u.inputString();
			}
		}
		while(lower<=upper);
			if (count>n)
			{
				System.out.println("Number not found");
			}
			else
			{
				System.exit(0);
			}
		}
	public static void main(String[] args)
    {
		
}
}
