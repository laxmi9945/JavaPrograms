package bridgeittest;
import java.util.*;

public class LeapYear {
public static void main(String[] args)
{
	int leap;
	System.out.println("Enter the year:");
	Scanner scan=new Scanner(System.in);
	leap=scan.nextInt();
	if(leap%4==0)
	{
		System.out.println("leap year");
	}
	else{
		System.out.println("not leap year");
	}
	
}
}
