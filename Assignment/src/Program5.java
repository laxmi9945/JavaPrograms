import java.util.Arrays;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int no=scan.nextInt();
		int[] number=new int[no];
		System.out.println("enter the"+" "+no+" elements:");
		for(int i=0;i<number.length;i++){
			number[i]=scan.nextInt();
		}
		for(int j=0;j<number.length-1;j++){
			for(int i=0;i<number.length-1-j;i++){
				if(number[i]>number[i+1]){
					int temp=number[i];		
					number[i]=number[i+1];
					number[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(number));
		scan.close();
	}
}
