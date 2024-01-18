
public class FaceBookPage {


	String name;//non static global variable - object
	int pageViews;//non static global variable - object
	static String owner="Facebook.inc.co";//static global variable - class name
	
	public void printPageDetails() {//non static function
		System.out.println("Name: "+name+" and PageViews: "+pageViews+"Owner: "+owner);
	}

	public static void printCompanyDetails() {//static function
		System.out.println("Owner: "+owner+".Founded in 2005");
		}
	
	public void increasePageViews(int views) {//non static function
		pageViews+=views;
	}
}
