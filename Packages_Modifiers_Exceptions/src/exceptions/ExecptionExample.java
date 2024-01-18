package exceptions;

public class ExecptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start");
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();;

		}finally {//always executed
			System.out.println("Finally Block");
		}
		
		
		
		System.out.println("End");
	}

}
