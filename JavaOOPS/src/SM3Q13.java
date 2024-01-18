
public class SM3Q13 {

	int i;
	public static void main(String[] args) {
		SM3Q13 t1 = new SM3Q13();
		t1.i=100;
		SM3Q13 t2 = new SM3Q13();
		t2.i=200;
		SM3Q13 t3 = new SM3Q13();
		t3.i=300;
		t1=t3;//300
		t3.i=200+t1.i;//500
		System.out.print(t1.i);//500
		t3= new SM3Q13();
		t2=t3;
		System.out.print(t2.i);
	}

}
