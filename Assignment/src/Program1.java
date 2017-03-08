/*Wap that stores a list of number in an array and compute 
 * the maximum summation of the value
 */
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of array:");
		Scanner scanner=new Scanner(System.in);
		
		int size=scanner.nextInt();
		int[] array=new int[size];
		int sum=0;
		System.out.println("Enter the 10 elements:");
		for(int i=0;i<size;i++){
			array[i]=scanner.nextInt();
		}
		for(int number:array){
			sum=sum+number;
		}
		System.out.println("Sum of array elements is:"+sum);
		scanner.close();
	}

}
