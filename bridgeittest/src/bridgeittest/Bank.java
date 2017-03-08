package bridgeittest;

public class Bank {
	public static void main(String args[])
	{ 
		Utility u=new Utility();
		BankTest banktest=new BankTest();
		int ch = 0;
		do
		{ 
		   	System.out.println("************Welcome to BankEx**********");
		   	System.out.println("1.Deposit");
		   	System.out.println("2.Withdraw");
		   	System.out.println("3.Number of people in the Queue ");
		   	System.out.println("4.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=u.inputInteger();
		   	switch (choice) 
		   	{
		   	case 1:
			   		System.out.println("Enter the Deposit amount");
			   		banktest.insert(u.inputInteger()); 
			   		banktest.display();
			   		break;
		   	case 2:
			   		System.out.println("Enter the Withdraw amount");
					u.inputInteger();
					banktest.remove();
			   		System.out.println(" Available Balance : "); 
			   		banktest.display();
			   		break;
			case 3:
					int x=banktest.getSize();
					System.out.println("The Number of People in the Queue : "+x);	
					break;
		   	case 4:
		   		System.out.println("Visit again :)");
			   		System.exit(0);
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		break;
		   	}
	   	}
		while(ch<5);
	}		
} 




