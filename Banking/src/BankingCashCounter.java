import java.util.Scanner;

public class BankingCashCounter {
public static void main(String[] args){
	CashLogic logic=new CashLogic();
		int ch = 0;
		do {
			System.out.println();
			System.out.println("------------Banking Cash Counter-----------");
			System.out.println("1.Deposite");
			System.out.println("2.Withdraw");
			System.out.println("3.Number of peopele in the queue");
			System.out.println("4.Exit");
			System.out.println("--Enter your choice--");
			System.out.println();
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount you want to deposite:");
				// insert
				
				logic.insert(data);
				// amt++
				// display amt
				
				logic.display();
				break;
			case 2:
				System.out.println("Enter the amount you want to withdraw:");
				// withdraw
				logic.insert(data);
				// amt--
				// display amt
				logic.display();
				break;
			case 3:
				System.out.println("The number of people in the queue is:");
				
				break;
			case 4:
				System.exit(0);
			}
			scan.close();
		} while (ch < 5);
	}
}
