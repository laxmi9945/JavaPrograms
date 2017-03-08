package bridgeittest;

import java.util.Random;

public class CouponTest {
	public static void main(String[] args)
	{
		/*System.out.println("Enter coupons:");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();*/
		char[] character="12345abcdeABCDE".toCharArray();
		//int max=1000;
		
		Random r = new Random();
		
		//int random = (int) ( Math.random()*max );
		//System.out.println(random);
		for (int i = 0; i < 50; i++) {
			StringBuffer sbr=new StringBuffer();
			while ( sbr .length() < 4 )
			{
				int rn = r.nextInt( character.length-1 );
				if( rn < 0)
				{
					continue;
				}
				sbr.append(character[rn]);
			}
			String CCode=sbr.toString();
			System.out.println("Coupon is: "+CCode);
		}
		 
}
}
