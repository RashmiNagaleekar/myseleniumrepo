
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(6<9);
		System.out.println(6>6);
		System.out.println(6<=9);
		System.out.println(6>=6);
		System.out.println(6==6);
		System.out.println(6!=6);
		System.out.println(6!=9);
		
		int a = 10;
		int b = 6;
		
		
		if(a!=b) {
			System.out.println("a is not equal to b");
		}
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		String str1 = "Today is a fine day";
		String str2 = "Today is a fine day";
		System.out.println(str1==str2); // == is only for primitive data type
		System.out.println("str1.contentEquals(str2) = "+str1.contentEquals(str2));
		System.out.println("str1.compareTo(str2) ="+str1.compareTo(str2));
		System.out.println("str1.equalsIgnoreCase(str2) ="+str1.equalsIgnoreCase(str2));
		System.out.println("str1.length() ="+str1.length());
		
		boolean strb = str1.equals(str2);
		
		System.out.println(strb);
		
		if(str1.equals(str2))
			System.out.println("Both are equal");
		
		str1 = str1.substring(1);
		System.out.println(str1);
		
		str1 = str1.substring(1, 10);
		System.out.println(str1);
		
		
	}

}
