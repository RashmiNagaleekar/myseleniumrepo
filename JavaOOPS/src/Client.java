
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FaceBookPage fb1 = new FaceBookPage();
		FaceBookPage fb2 = new FaceBookPage();
		FaceBookPage fb3 = new FaceBookPage();
		
		
		fb1.name="HomePage";
		fb1.pageViews=1001;
		
		fb2.name="ProfilePage";
		fb2.pageViews=2000;
		
		fb3.name="FriendsPage";
		fb3.pageViews=3000;
		
		System.out.println(fb1.name);
		System.out.println(fb2.name);
		System.out.println(fb3.name);
		
		fb1=fb2;
		System.out.println("----------------------");
		System.out.println(fb1.name);
		System.out.println(fb2.name);
		System.out.println(fb3.name);//non-static variables should be accesses with the help of objects
		System.out.println(FaceBookPage.owner);//static variables can be accesses directly
		
		fb1.name="Log out page";
		System.out.println("----------------------");
		System.out.println(fb1.name);
		System.out.println(fb2.name);
		System.out.println(fb3.name);//non-static variables should be accesses with the help of objects
		System.out.println(FaceBookPage.owner);//static variables can be accesses directly
		
		
		System.out.println("----------------------");
		fb1.printPageDetails();
		fb2.printPageDetails();
		fb3.printPageDetails();
		
		FaceBookPage.printCompanyDetails();
		
		fb1.increasePageViews(100);
		fb3.increasePageViews(200);

		System.out.println("----------------------");
		System.out.println("Details after increasing views");
		fb1.printPageDetails();
		fb2.printPageDetails();
		fb3.printPageDetails();
		
		FaceBookPage fb4=null;
		fb4=new FaceBookPage();
		fb4.name="Settings Page";
		System.out.println("----------------------");
		System.out.println("Details after increasing views");
		fb1.printPageDetails();
		fb2.printPageDetails();
		fb3.printPageDetails();
		fb4.printPageDetails();
		
		
	}

}
