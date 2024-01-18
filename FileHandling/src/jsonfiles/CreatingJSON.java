package jsonfiles;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreatingJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject student1 = new JSONObject();
		student1.put("name", "student A");
		student1.put("place", "India");
		student1.put("grade", "5th");
		
		System.out.println(student1.toJSONString());
		
		
		JSONObject student2 = new JSONObject();
		student2.put("name", "student B");
		student2.put("place", "UK");
		student2.put("grade", "6th");
		
		System.out.println(student2.toJSONString());
		
		JSONArray details = new JSONArray();
		details.add(student1);
		details.add(student2);
		
		System.out.println(details.toJSONString());
		
		JSONObject studentdetails = new JSONObject();
		studentdetails.put("studentdetails", details);
		
		System.out.println(studentdetails.toJSONString());

	}

}
