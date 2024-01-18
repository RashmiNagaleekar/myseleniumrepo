class A
{
int i;
public void display()
{
System.out.print(i);
}
}
class B extends A
{
int j;
public void display()
{
System.out.print(j);
}
}
public class SM4Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.i=1;
		a.display();
		B b = new B();
		b.i=2;
		b.j=3;
		b.display();
		A c=new B();
		c.i=4;
		c.display();


		B obj2 = new B();
		obj2.i = 1;
		obj2.j = 2;
		A r;
		r = obj2;


		r.display();

	}

}
