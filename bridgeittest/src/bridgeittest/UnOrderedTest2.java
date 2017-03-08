package bridgeittest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class UnOrderedTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		UnorderedTest2logic uTest2logic=new UnorderedTest2logic();
		Utility utility=new Utility();
		FileReader fr=new FileReader("/home/bridgeit/workspace/bridgeittest/src/bridgeittest/UnOrderedTest2");
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		
		try {
			s = br.readLine();
			System.out.println(s);
			String[] array = s.split(" ");
			//System.out.println(array.toString());
			for(int i=0;i<array.length;i++){
				list.add(array[i]);
			}
			System.out.println(list);
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the text which u want to remove or add in the file: ");
			
			/*if(list.contains(input)){
				list.remove(input);
			}
			else 
			{
				list.add(input);
			}
			//for()
			 */			
			
			uTest2logic.insert(utility.inputString()); 
			uTest2logic.display();
			System.out.println("Enter the text which u want to remove or add in the file: ");
			
			uTest2logic.remove(utility.inputString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
