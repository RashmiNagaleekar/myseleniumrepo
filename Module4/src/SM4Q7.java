
public class SM4Q7 {
	public void m1 (String i,int f)
	{
	System.out.print(i+f);
	}

	public void m1(int f,String i)
	{
	System.out.print(i+f);
	}

	public static void main(String[]args)
	{
		SM4Q7 s=new SM4Q7();
	s.m1("A", 1);
	s.m1(2, "B");
	}
}
