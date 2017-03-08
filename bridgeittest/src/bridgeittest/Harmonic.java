package bridgeittest;
import java.util.*;

public class Harmonic {
	public static void main(String[] args)
	{
		int no,i;
		double s=0.0;
		System.out.println("Enter d number to find harmonic:");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		for(i=1;i<=no;i++)
		{	
			s+=1.0/i;
		}
		System.out.println("Harmonic is:"+s);
		
	}

}
