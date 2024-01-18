package testcases;

public class testUtil {


	String testname;
	private int count;
	protected int i;
	
	void printName() {
		System.out.println(testname);
	}

	public void increaseCount() {
		count = count+1;
		System.out.println("Count : "+count);
	}
}
