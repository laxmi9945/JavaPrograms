package bridgeittest;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTest {
public static void main(String[] args) {
	
		JSONParser parser=new JSONParser();
	try {
		Object object=parser.parse(new FileReader("/home/bridgeit/workspace/bridgeittest/src/bridgeittest/JsonData2.json"));
		JSONObject jsonobject=(JSONObject)object;
		System.out.println(jsonobject);
		
		String data=(String)jsonobject.get("data");
		System.out.println(data);
		
		JSONArray details=(JSONArray)jsonobject.get("data");
		String[] str={"Rice","Wheats"};
		for(int i=0;i<details.size();i++){
			
		}
		Iterator<String> iterator=details.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Total price:");
		
		
		
		
		
		
		
		//loop 
		/*JSONArray jsonobject=(JSONArray)jsonobject.get("data");
		Iterator<String> iterator=jsonobject.iterator();
		*/
		
		//System.out.println(jsonobj.toString());
		/*while(iterator.hasNext()){
		System.out.println(iterator.next());
		
		}*/
		/*String name = (String) jsonObject.get("name");
        System.out.println(name);*/
		/*for(int i=0;i<jsonarr.size();i++)
		{
			//System.out.println();
		}*/
		
		
	} catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
