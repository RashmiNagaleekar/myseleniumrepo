
public class FunctionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing Part 1");
		int res=add(10,20,30);
		display(res);
		res=add(20,30,40);
		display(res);
		res=add(30,40,50);
		display(res);
		
		Boolean r1=isWordPresent("This is not a very good idea","good");
		System.out.println("Result of isWordPresent(): "+r1);
	}
	public static int add(int a, int b, int c)
	{
		System.out.println("Values are "+a+" "+b+" "+c);
		int res=a+b+c;
		System.out.println("Result is "+res);
		return res;
	}
	
	public static void display(int res)
	{
		System.out.println("Result displaying from display() called from main(): "+res);
	}
	
	public static boolean isWordPresent(String str, String word) {
		
		if(str.indexOf(word)==-1) {
			return false;
		}
		else
			return true;
	}

}
