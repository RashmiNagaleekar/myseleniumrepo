
public class Point {

	int x;
	int y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point();
		p.x=100;
		p.y=100;
		System.out.println("x: "+p.x+" y: "+p.y);
		p.change(200, 300);
		System.out.println("x: "+p.x+" y: "+p.y);

		//pass by value
		p.incrementBy(p.x, p.y, 100);
		System.out.println("-----in main()--------");
		System.out.println("x: "+p.x+" y: "+p.y);
		
		//pass by reference
		p.incrementBy(p, 200);
		System.out.println("-----in main()--------");
		System.out.println("x: "+p.x+" y: "+p.y);
	}
	
	public void change(int a, int b) {		//pass by value
		x=a;
		y=b;
	}
	
	public void incrementBy(int a, int b, int inc) {		//pass by value
		a=a+inc;
		b=b+inc;
		System.out.println("-----in incrementBy()--------");
		System.out.println("Value of a: "+a+" Value of b: "+b);
	}
	
	public void incrementBy(Point point,int inc) {	//pass by reference
		
		point.x+=inc;
		point.y+=inc;
		System.out.println("-----in incrementBy()--------");
		System.out.println("Value of x: "+point.x+" Value of y: "+point.y);
	}

}
