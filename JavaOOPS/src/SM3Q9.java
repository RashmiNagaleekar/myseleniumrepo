
public class SM3Q9 {

	int i;
	int j;
	public static void main(String[] args) {
		SM3Q9 t1 = new SM3Q9();
		t1.i=200;
		t1.j=100;
		add(t1.i,t1.j);
		System.out.print(t1.i);
		System.out.print(t1.j);
	}

	public static void add(int i,int j) {
		i=i+100;
		j=j+100;
		System.out.print(i);
		System.out.print(j);

	}
}
