package bridgeittest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleWriteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("data","Rice");
		jsonobject.put("name", "Basmati");
		jsonobject.put("weight","5");
		jsonobject.put("price","50");
		jsonobject.put("data2","Wheats");
		jsonobject.put("name2", "khorasin");
		jsonobject.put("weight2","3");
		jsonobject.put("price2","50");
		FileWriter file;
		try {
			file = new FileWriter("/home/bridgeit/Documents/JsonTest.json");
			file.write(jsonobject.toJSONString());
	        file.flush();
	        System.out.println(jsonobject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
