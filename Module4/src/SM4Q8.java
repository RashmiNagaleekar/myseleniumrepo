class Test
{
int x;
double y;
void add(int a , int b)
{
x = a + b;
}
void add(double c , double d)
{
y = c + d;
}
Test()
{
this.x = 0;
this.y = 0;
}
}
public class SM4Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj= new Test();
		int a = 2;
		double b = 3.2;
		obj.add(a, a);
		obj.add(b, b);
		System.out.println(obj.x + " " + obj.y);

	}

}
