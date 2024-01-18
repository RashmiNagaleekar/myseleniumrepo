
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		int c=300;
		int d=400;
		
		if(a<b&&c<d)
			System.out.println("a is lesser");
		
		if(isLoggedIn() && isInboxLinkPresent())
			System.out.println("Compose Mail");
	}
	public static boolean isLoggedIn() {
		System.out.println("isLoggedIn()");
		return true;
	}

	public static boolean isInboxLinkPresent() {
		System.out.println("isInboxLinkPresent");
		return true;
	}
}
