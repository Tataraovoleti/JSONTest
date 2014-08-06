import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */

/**
 * @author Tatarao voleti
 * @date   07-Feb-2014
 *
 */
public class JsonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JSONArray array=new JSONArray();
		
		array.put("one");
		array.put(new Integer(2));
		array.put(new Double(3.0));
		
		System.out.println("Json Array Data : ");
		System.out.println(array.toString());
		
		JSONObject obj=new JSONObject();
		obj.put("Romans 1","I");
		obj.put("Romans 2","II");
		obj.put("Romans 3","III");
		array.put(obj);
		System.out.println(array.toString());
		
		JSONArray arr=new JSONArray();
		arr.put("one");
		arr.put(new Integer(2));
		arr.put(new Double(3.0));
		
		JSONObject ob=new JSONObject();
		ob.put("Romans 1","I");
		ob.put("Romans 2","II");
		ob.put("Romans 3","III");
		
		System.out.println("Json Obj Data : ");
		System.out.println(ob.toString());
		ob.put("No's ",arr);
		System.out.println(ob.toString());
		
		
	}

}
