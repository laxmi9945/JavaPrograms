package bridgeittest;

import java.util.Scanner;
import java.util.Stack;

public class BalanceTest {
	public static void main(String[] args) {
	Stack<Character> stk= new Stack<Character>();
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the String:");
	String s1 = scan.nextLine();
	char[] ch = s1.toCharArray();
	int st = 0;
	for (int i = 0; i < ch.length; i++) {
	if (ch[0] != '(')
		{
			st++;
			break;
		}
		if ((ch[i] == '('))
			{
				stk.push(ch[i]);
			} 
		else if ((ch[i] == ')'))
			{
				stk.pop();
			}
		}
			if (stk.isEmpty() && st == 0)
				System.out.println("Balanced");
			else
				System.out.println("Not balanced");
			scan.close();
	}	
	
}

