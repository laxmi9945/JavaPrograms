package bridgeittest;
import java.util.*;

public class Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int no;
		int pow = 1;
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		no=scan.nextInt();
		while(i<=no){
			System.out.println("2^"+i+"="+pow);
			pow=pow*2;
			i++;
			
		}
	}

}
