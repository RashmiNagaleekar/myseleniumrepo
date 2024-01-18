interface calculate
{
void cal(int item);
}
class displayA implements calculate
{
int x;
public void cal(int item)
{
x = item * item;
}
}
class displayB implements calculate
{
int x;
public void cal(int item)
{
x = item / item;
}
}
public class SM4Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayA arr1 = new displayA();
		displayB arr2 = new displayB();
		arr1.x = 0;
		arr2.x = 0;
		arr1.cal(2);
		arr2.cal(2);
		System.out.print(arr1.x + " " + arr2.x);

	}

}
