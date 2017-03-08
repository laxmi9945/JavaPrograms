package bridgeittest;

import java.util.Scanner;

public class StockReport {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Stockinput stockinput= new Stockinput();
		int stockNumber;
		System.out.println("Enter number of Stocks: ");
		stockNumber = input.nextInt();
		 
		stockinput.entry(stockNumber);
		stockinput.calculate();
		stockinput.totalvalue();
		input.close();
	}
}
