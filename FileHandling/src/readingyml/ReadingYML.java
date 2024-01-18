package readingyml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
//Map - JSONObject
//List - JSONArray
public class ReadingYML {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws FileNotFoundException, YamlException {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir")+"//test.yml";
		YamlReader reader = new YamlReader(new FileReader(path));
		Map map = (Map)reader.read();
		//Map mapSet = (Map) map.keySet();
		System.out.println(map);
		List datasets = (List)map.get("testdata");
		System.out.println(datasets);
		Map dataSet = (Map)datasets.get(0);
		System.out.println(dataSet);
		String name = (String)dataSet.get("testName");
		System.out.println(name);
		List data = (List)dataSet.get("data");
		Map currentData = (Map)data.get(0);
		System.out.println(currentData.get("browser"));
		
		System.out.println("-----Using For Loop---");
		
		List testData1 = (List) map.get("testdata");
		//System.out.println(testData1);

		for(int i = 0;i<testData1.size();i++) {
					Map testDetails1 = (Map)testData1.get(i);
					String testName1 = (String) testDetails1.get("testName");
					System.out.println(testName1);
					List data1 = (List) testDetails1.get("data");
					System.out.println(data1.size());

					
					for(int j = 0;j<data1.size();j++) {
					
						List<String> currentTestData = (List<String>) data1.get(j);
						System.out.println(currentTestData);
						Set<String> keys = map.keySet();
						//Iterator<String> it = keys.iterator();
						//while(it.hasNext()) {
							//String key = it.next();
							//String value = (String) currentTestData.get(key);
							//System.out.println(key + "--" +value);
						for(String a:currentTestData) {
							System.out.println(a);
						
					}
						
						
					}
		}
	}
}