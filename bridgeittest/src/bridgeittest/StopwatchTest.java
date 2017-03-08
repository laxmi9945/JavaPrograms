package bridgeittest;

import java.util.Scanner;

public class StopwatchTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2;
		int start=0,stop=0;
		int elapsed;
		System.out.println("Print 1 for start stopwatch:");
		Scanner scan=new Scanner(System.in);
		no1=scan.nextInt();
		if(no1==1){
			start = (int) System.currentTimeMillis();
		}
		else{
			System.out.println("U hv entered wrong no:");
		}
		System.out.println("Print 2 for start stopwatch:");
		Scanner scan2=new Scanner(System.in);
		no2=scan2.nextInt();
		if(no2==2){
			stop=(int) System.currentTimeMillis();
		}
		else{
			System.out.println("U hv entered wrong no:");
		}
	    elapsed=stop-start;
	    System.out.println("Elapsed time is:"+elapsed+"ms");
		 scan.close();
		 scan2.close();
			
	}
}
