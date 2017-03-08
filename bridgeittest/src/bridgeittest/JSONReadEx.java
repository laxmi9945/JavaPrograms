package bridgeittest;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser parser=new JSONParser();
		try {
			Object object=parser.parse(new FileReader("/home/bridgeit/Documents/JsonTest.json"));
			JSONObject jsonobject=(JSONObject)object;
			System.out.println(jsonobject);
			System.out.println();
			String name=(String)jsonobject.get("name");
			String price1=(String)jsonobject.get("price");
			String weight1=(String)jsonobject.get("weight");
			String name2=(String)jsonobject.get("name2");
			String price2=(String)jsonobject.get("price2");
			String weight2=(String)jsonobject.get("weight2");
			System.out.println("Rice product name:"+" " +name);
			System.out.println("Price per Kg:"+"Rs." +price1);
			System.out.println("Weight:"+"Kg:"+" " +weight1);
			System.out.println();
			System.out.println("Wheat product name:"+" " +name2);
			System.out.println("Price:"+"Rs." +price2);
			System.out.println("Weight:"+"Kg:"+" " +weight2);
			int totalprice;
			int price3=Integer.parseInt(price1);
			int weight3=Integer.parseInt(weight1);
			int rice_price=weight3*price3;
			int price4=Integer.parseInt(price2);
			int weight4=Integer.parseInt(weight2);
			int wheats_price=weight4*price4;
			System.out.println();
			System.out.println("total price of rice is:"+" "+"Rs."+rice_price);
			System.out.println("total price of wheats is:"+" "+"Rs."+wheats_price);
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
