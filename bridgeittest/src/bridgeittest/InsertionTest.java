package bridgeittest;

import java.util.Scanner;

public class InsertionTest {
		public static void main(String[] args) {
			System.out.println("Enter the elements:");
			Scanner scan=new Scanner(System.in);
			String str=scan.nextLine();
			char[] ch=str.toCharArray();
			String str1=insertionSort(ch);
			System.out.println(ch);
	}

		private static String insertionSort(char[] ch) {
			// TODO Auto-generated method stub
			int len=ch.length;
			for(int i=0;i<len;i++)
				for(int j=i;j>0;j--)
					if(ch[j]<ch[j-1])
					{	
						char temp=ch[j];
						ch[j]=ch[j-1];
						ch[j-1]=temp;
					}
			
			return new String(ch);
		}
}
