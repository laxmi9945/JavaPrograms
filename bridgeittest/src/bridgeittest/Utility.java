package bridgeittest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utility {
	BufferedReader br;

	//Utility constructor for creating object for BufferedReader
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	//input integer
	
	public int inputInteger(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}
	
	// read String input
		public String inputString() {
			try {
				return br.readLine();

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			return " ";
		}


}
