package bridgeittest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class OrderedList {
public static void main(String[] args) throws IOException{
	LinkedList<Integer> ll=new LinkedList<Integer>();
	FileReader fr=new FileReader("/home/bridgeit/workspace/bridgeittest/src/bridgeittest/orderedlist");
	BufferedReader br=new BufferedReader(fr);
	String s1="";
	String s2="";
	int no=br.readLine();
	for (int i = 0; i < s1.length; i++) {
		ll.add(s1[i]);
	}
	br.close();
	String[] str=s2.split(",");
	int[] n = new int[str.length];
	for (int i = 0; i < str.length; i++) 
		{
			n[i] = Integer.parseInt(str[i]);
		}
	Arrays.sort(n);
	
	for (int j = 0; j < n.length; j++) {
			System.out.print(n[j]);
		}
		for (int i = 0; i < n.length; i++) {
			ll.add(n[i]);
		}
	System.out.println(ll);
	System.out.print(" ");
	
	/*Utility u = new Utility();
	NodeFunction node = new NodeFunction();
	File file = new File("Order.txt"); // which reads the given file
	String string= u.readFile(file); //reading file method of Utility class is called.
	System.out.println("Contents of file are: "+string);
	string = string.trim();
	String strArray[] = string.split(" ");
	
	for(int i=0;i<strArray.length;i++){// compare to the array length
		node.addNode(Integer.parseInt(strArray[i]));
	}
	
	System.out.print("List Elements are: ");
	node.showList();// to display the list of elements

	System.out.print("\nPlease Enter the element you want to Search: ");
	int value = u.inputInteger();
	node.search(value);*/
}
}
