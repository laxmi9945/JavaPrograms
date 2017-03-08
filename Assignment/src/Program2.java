import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the elements:");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<array.length;i++){
			array[i]=scan.nextInt();
		}
		int max=getMax(array);
		System.out.println("max value:"+max);
		int min=getMin(array);
		System.out.println("min value:"+min);
		scanner.close();
		scan.close();
	}

	private static int getMax(int[] array) {
		
		int maxvalue=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]>maxvalue)
				maxvalue=array[i];
		}
		return maxvalue;
	}

	private static int getMin(int[] array) {
		
		int minvalue=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<minvalue)
				minvalue=array[i];
		}
		return minvalue;
	}
	

}
