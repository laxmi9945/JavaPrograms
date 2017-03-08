package bridgeittest;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Enter the number:"); Scanner scan=new
		 * Scanner(System.in); int no=scan.nextInt(); int[] a=new int[no];
		 * for(int i=0;i<a.length;i++){
		 * 
		 * }
		 * 
		 * { System.out.println(); } } System.out.println(
		 * "Think a no between the range:"); Scanner scan2=new
		 * Scanner(System.in); int no2=scan2.nextInt(); if(no2<no-1){
		 * System.out.println("number exist"); } else{ System.out.println(
		 * "Enter valid number under the range"); }
		 * 
		 * scan.close(); }
		 */
		/*int low;
		int high;
		int no;
		//System.out.println(args[0]);
		System.out.println("Think a number in between 0 to args:");
		Scanner scan = new Scanner(System.in);
		int no2 = scan.nextInt();
		System.out.println("Is your number inbetween args if yes type lesser or greater:");
		//if(no2<high)
	}
		public int binarySearch(String[] words,String search){
			int first=0;
			int mid=0;
			int last=words.length;
		while (first < last) {
			mid = (first + last) / 2;
		}
		if (search.compareTo(words[mid]) < 0) {
			last = mid;
		} else if (search.compareTo(words[mid]) > 0) {
			first = mid + 1;
		} else {
			return mid;
		}
		return 0;*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter No. of Steps you want");
		int steps = scanner.nextInt();
		int result = 1,N;
		boolean check;
		for(int i=0;i<steps;i++){
			result = result*2;
		}

		//Asking the user to imagine a number
		N = result;
		System.out.println("Imagine the no. between 0 to "+(N-1));
		int first = 1;
		int last = N/2;
		int i=2,j=4;

		//Cheaking the numbers
		for(int k=1;k<steps;k++){
			System.out.println("Is Your no Present Between "+(first-1)+" to "+(last-1)+"??\ntrue or false");
			check = scanner.nextBoolean();
			if(check){
				N = N/2;
				last = last-((last-first+1)/2);
			}
			else{
				first = first+N/i;
				last = last+N/j;
				i = i+i;
				j = j+j;
			}
		}
		//final check between 2 numbers and printing Answer
		System.out.println("Is Your no is "+(first-1)+"?? \ntrue or false");
		check = scanner.nextBoolean();
		if(check)
			System.out.println("Answer is: "+(first-1));
		else
			System.out.println("Answer is: "+(last));
	}
}

