package bridgeittest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileUtility {
	BufferedReader br,rf = null;

	//Utility constructor for creating object for BufferedReader
	public FileUtility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//input string
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
	
	//input Integer
	public int inputInteger(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}

	//input double
	public double inputDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}


	//input boolean
	public boolean inputBoolean(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

	//taking integer array input
	public Integer[] inputIntArray(int size){
		Integer array[] = new Integer[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter Element at "+(i+1)+" position: ");
			array[i] = this.inputInteger();
		}
		return array;
	}

	//taking String array input
	public String[] inputStringArray(int size){
		String array[] = new String[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter String at "+(i+1)+" position: ");
			array[i] = this.inputString();
		}
		return array;
	}

	//Array Printing(one dimentional) Generic type
	public <T> void printArray(T[] inputArray){
		for(T i:inputArray)
			System.out.print(i+" ");

		System.out.println();
	}

	//Array printing(two dimentional) Generic type
	public <T> void printArray(T[][] inputArray,int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	//reading file
	public String readFile(File file){
		
		try{
			rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}

	//Writing into file int Data
	public void writeFile(File file,int data){
		try{
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(str+data+" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//writing into file String data
	public void writeFile(File file,String data){
		try{
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string+" "+data);
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	//Clear the Data inside the file
	public void clearFile(File f){
		try{
			String s = this.readFile(f);
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
