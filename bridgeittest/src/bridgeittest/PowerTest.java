package bridgeittest;

import java.util.Scanner;

public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int no;
		int power=1;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		no=scan.nextInt();
		while(i<=no)
		{
			System.out.println("2^"+i+"="+power);
			power=power*2;
			i++;
		}
		

	}

}
