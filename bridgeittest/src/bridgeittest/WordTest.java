package bridgeittest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordTest {

	public static void main(String[] args) throws IOException {
		
		//System.out.println("az".compareTo("aa") );
		
		// TODO Auto-generated method stub
		String strarr1[];	
		
		FileReader fr=new FileReader("/home/bridgeit/workspace/bridgeittest/src/bridgeittest/bridgeittest/Laxmi.txt");
		BufferedReader bfr=new BufferedReader(fr);
		StringBuilder sbr=new StringBuilder();
		String string = "";
		String elements="";
		while((elements=bfr.readLine())!=null){
			string +=elements;
		}
		System.out.println(sbr.toString());
		bfr.close();
		String stringarray[]=string.split(" ");
		Arrays.sort(stringarray);
		//System.out.println("Sorted Ordered for String is:"+strarr1);
		int length=stringarray.length;
		for(int i=0;i<length;i++){
			//System.out.println(stringarray[i]);
		}
		System.out.println("Enter the word 2 b search:");
		Scanner scan=new Scanner(System.in);
		String search=scan.next();
		System.out.println(search);
		int bs=binarysearch(stringarray,search);
		if(bs==0){
			System.out.println("*********************");
			System.out.println("Word found:"+search);
		}
		else{
			System.out.println("Word not found");
		}
		
	}
	private static int binarysearch(String strarr1[], String search) {
		// TODO Auto-generated method stub
		int first=0;
		int mid;
		int last=strarr1.length;
		if(strarr1.length==0){
			return -1;
		}
		
			
		while(first<last){
			mid=(first+last)/2;
			int v = search.compareTo( strarr1[mid] );
			if(v > 0){
				first=mid+1;
			}
			else if(v < 0)
			{
				last=mid;
			}
			else{
				return v;
			}
		}
		
		return -1;
	}
}
