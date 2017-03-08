package bridgeittest;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scanner=new Scanner(System.in);	
			System.out.println("Enter a String to check its palindrome or not");
			String s=scanner.next();
			scanner.close();
			char[] c=s.toCharArray();
			System.out.println(checkPalindrome(c,(c.length/2)));
			
			
			}
			static boolean checkPalindrome(char[] c,int size){
				Deque d=new Deque(10);
				for (int i = 0; i <c.length; i++) {
					d.addFront(c[i]);
				}
				
				for (int i = 0; i <size; i++) {	
					if(!((char)d.removeFront()==(char)d.removeRear())){
						return false; 
					}
				}
				return true;
	}

}
