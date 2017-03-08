package bridgeittest;

import java.util.Scanner;

public class Stockinput {
	public int no;
	double allTotal = 0;
	
	Scanner scanner = new Scanner(System.in);
	String name[] = new String[10];
	int share[] = new int[10];
	double value[] = new double[10];
	double total[] = new double[10];
	
	//for entry of stock details
	public void entry(int number){
		no = number;
		for(int i=0;i<number;i++){
			System.out.println("Please Enter Details for Stock: "+(i+1));
			System.out.println("Enter ur Name:");
			name[i] = scanner.next();
			System.out.println("No. of shares:");
			share[i] = scanner.nextInt();
			System.out.println("Value for Each share:");
			value[i] = scanner.nextDouble();		
		}
		
	}

	//calculating total of each stock
	public void calculate(){
		for(int i=0;i<no;i++){
			total[i] = share[i]*value[i];
			System.out.println("Total value for Stock "+(i+1)+" is: "+total[i]+" Rs");
		}
	}

	//Calculating total 
	public void totalvalue(){
		for(int i=0;i<no;i++){
			allTotal = allTotal+total[i];
		}
		System.out.println("Total value of all "+no+" Stock is: "+allTotal+" Rs");
	}
}
