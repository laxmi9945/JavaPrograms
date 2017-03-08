package bridgeittest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UnOrderedTest {
	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> ll = new LinkedList<String>();
		FileReader fr = new FileReader(
				"/home/bridgeit/workspace/bridgeittest/src/bridgeittest/UnOrderedText");
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		String sw = "";
		//int flag = 0;
		try {
			s = br.readLine();
			System.out.println(s);
			String[] s1 = s.split(" ");
			for (int i = 0; i < s1.length; i++) {
				ll.add(s1[i]);
			}
			System.out.println(ll);
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the word that u hv 2 search:");
			String s2 = scanner.nextLine();
			scanner.close();
			if (ll.contains(s2)) {
				ll.remove(s2);
			} else {
				ll.add(s2);
			}
				
			for (String string : ll) {
				sw += string + " ";
			}
			
			/*
			for (int i = 0; i < ll.size(); i++) {
				if (s2.equalsIgnoreCase(ll.get(i))) {
					System.out.println("the word found we have to remove this one");
					// String s3 = ll.remove(i);
					// System.out.println(s3);
					flag = 1;
				} else
					sw += ll.get(i) + " ";
			}
			System.out.println(sw);
			writefile(sw);
			if (flag == 0) {
				System.out.println("the word not found");
				ll.add(s2);
				sw += s2;
				writefile(sw);
				System.out.println(sw);
			}
			for (int i = 0; i < ll.size(); i++) {
				System.out.print(ll.get(i) + " ");
			}
			*/

			writefile(sw);
		} catch (IOException e) {
			e.printStackTrace();
		};
		
	}

	public static void writefile(String s) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(
					"/home/bridgeit/workspace/bridgeittest/src/bridgeittest/UnOrderedText"));
			writer.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
			}
		}
	}

}
