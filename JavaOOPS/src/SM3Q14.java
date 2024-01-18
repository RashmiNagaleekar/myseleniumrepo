
public class SM3Q14 {

	static int x=0;
	String name;
	boolean b;

	public static void main(String[] args) {
		SM3Q14 t1= new SM3Q14();
	x=x+10;
	System.out.println(t1.b);
	t1.start();
	System.out.println(t1.b);
	}

	public void start() {
	x++;
	b=true;
	System.out.println(x);
	}
}
