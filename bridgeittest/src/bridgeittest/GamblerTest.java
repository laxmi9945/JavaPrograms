package bridgeittest;

public class GamblerTest {
	public static void main(String[] args)
	{
		int stakes=5;
		int goal=7;
		int times=12;
		int bets=0;
		int wins=0;
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of stakes:");
		goal=scan.nextInt();
		System.out.println("Enter the number of goals:");
		stakes=scan.nextInt();
		System.out.println("Enter the number of times:");
		times=scan.nextInt();*/
		
	for(int t=0;t<times;t++)
	{
		int fair=stakes;
		while(fair>0 && fair<goal)
		{
			bets++;
		if(Math.random()<0.5)
			fair++; 
		else
			fair--;	
		if(fair==goal)
		{
			wins++;
		}
	}
	System.out.println(wins+"wins of:"+times);
	double win=100.0*wins/times;
	double loss=100-win;
	System.out.println("percentage of wins:"+100*wins/times+"%");
	System.out.println("percentage of loss:"+loss+"%");
	System.out.println("Avg Bets:"+1.0*bets/times);
	
	}
	}
}
