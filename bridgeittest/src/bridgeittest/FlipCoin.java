package bridgeittest;
import java.util.*;
public class FlipCoin {
	static int tails;
	static int heads;
	static int tailspercentage;
	static int headspercentage;
	public static void main(String[] args)
	{
		
		System.out.println("Enter the no of flips u want:");
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		Random rd=new Random();
		for(int i=0;i<no;i++)
		{
			if(rd.nextInt()>0.5)
			{
				tails++;
				System.out.println("Its tails");
			}
			else
			{
				heads++;
				System.out.println("Its heads");
			}
		}
		tails=100*tails/no;
		heads=100*heads/no;
		System.out.println("percentage of tails:"+tails+"%");
		System.out.println("Percentage of heads:"+heads+"%");
		
	}

}
