interface X
{
int i = 5;
}

class Y implements X
{
void f()
{
i = 10;
System.out.println("i="+i);

}
}
public class SM4Q5 {
	Y obj = new Y();
	obj.f();
	}
}
