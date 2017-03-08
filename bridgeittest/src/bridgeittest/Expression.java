package bridgeittest;

import java.util.Scanner;
import java.util.Stack;
public class Expression{
		public static void main(String[] args){
			boolean flag =false;
		        Stack<Character> input = new Stack<Character>();
		        System.out.println("Enter your String to check:");
		        Scanner scanner = new Scanner(System.in);
		        String sinput = scanner.nextLine();
		        char[] c = new char[15];
		        c = sinput.toCharArray();
		        for (int i = 0; i < c.length; i++) {
		            if (c[i] == '{' || c[i] == '(' || c[i] == '[')
		                input.push(c[i]);
		            else if (c[i] == ']') {
		                if (input.pop() == '[') {
		                    flag = true;
		                    continue;
		                } else {
		                    flag = false;
		                    break;
		                }
		            } else if (c[i] == ')') {
		                if (input.pop() == '(') {
		                    flag = true;
		                    continue;
		                } else {
		                    flag = false;
		                    break;
		                }
		            } else if (c[i] == '}') {
		                if (input.pop() == '{') {
		                    flag = true;
		                    continue;
		                } else {
		                    flag = false;
		                    break;
		                }
		            }
		        }
		        if (flag == true)
		            System.out.println("Balanced");
		        else
		            System.out.println("Not balanced");
		        scanner.close();
		}
	}


