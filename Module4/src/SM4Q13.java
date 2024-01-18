class X1
{
void calculate(int a, int b)
{
System.out.print("Class X ,");
}
}

class Y1 extends X1
{
@Override
void calculate(int a, int b)
{
System.out.print("Class Y ,");
}
}

class Z extends Y1
{
@Override
void calculate(int a, int b)
{
System.out.print("Class Z ,");
}
}
public class SM4Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X1 x = new Z();

		x.calculate(10, 20);

		Y1 y = new Z();

		y.calculate(50, 100);
	}

}
