import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.out.println(System.getProperty("user.dir"));//gives us a path of current project
		
		
		Properties prop = new Properties();
		//String path = "C:\\Users\\Lenovo\\eclipse-workspace\\FileHandling\\project.properties";
		//above statement same can be done by
		String path = System.getProperty("user.dir")+"\\project.properties";
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("url"));
		
		
	}

}
