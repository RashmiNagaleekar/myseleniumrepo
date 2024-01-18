package jsonfiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir")+"//test.json";
		FileReader reader = new FileReader(path);
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(reader);
		
		System.out.println(json.toJSONString());
		
		JSONArray testData = (JSONArray) json.get("testdata");
		System.out.println(testData.toJSONString());
		JSONObject testDetails = (JSONObject) testData.get(0);
		System.out.println(testDetails.toJSONString());
		JSONArray data = (JSONArray) testDetails.get("data");
		String testName = (String) testDetails.get("testName");
		System.out.println(testName);
		System.out.println(data.toJSONString());
		JSONObject testDataSet = (JSONObject)data.get(1);
		System.out.println(testDataSet.toJSONString());
		String browser = (String) testDataSet.get("browser");
		System.out.println(browser);
		
		System.out.println("-------------Using For loop-----------");
		
		JSONArray testData1 = (JSONArray) json.get("testdata");

		for(int i = 0;i<testData1.size();i++) {
					JSONObject testDetails1 = (JSONObject)testData1.get(i);
					String testName1 = (String) testDetails1.get("testName");
					System.out.println(testName1);
					JSONArray data1 = (JSONArray) testDetails1.get("data");
					System.out.println(data1.size());

					
					for(int j = 0;j<data1.size();j++) {
					/*
						JSONObject currentTestData = (JSONObject) data1.get(j);
						String runmode = (String) currentTestData.get("runmode");
						String password = (String) currentTestData.get("password");
						String browser2 = (String) currentTestData.get("browser");
						String username = (String) currentTestData.get("username");

						System.out.println(runmode+"--"+password+"--"+browser2+"--"+username);
						*/
						
						JSONObject currentTestData = (JSONObject) data1.get(j);
						Set<String> keys = currentTestData.keySet();
						Iterator<String> it = keys.iterator();
						while(it.hasNext()) {
							String key = it.next();
							String value = (String) currentTestData.get(key);
							System.out.println(key + "--" +value);
						}
						
						
					}
					
		}
		
	}

}
