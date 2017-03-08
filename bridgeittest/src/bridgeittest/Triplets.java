package bridgeittest;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0;
	int result=0;
	System.out.println("Enter the size of array:");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++){
		a[i]=scan.nextInt();
	}
	int n1=a.length;
	for(int i=0;i<n1-2;i++){
		for(int j=i+1;j<n1-1;j++){
			for(int k=j+1;k<n1;k++){
				sum=a[i]+a[j]+a[k];
				if(sum==0){
					System.out.println(a[i]+""+a[j]+""+a[k]);
					if(result==sum){
						System.out.println("triplet");
					}
					else{
						System.out.println("not triplet");
					}
				}
				
				
			}
		}
	}
	scan.close();
}
}
