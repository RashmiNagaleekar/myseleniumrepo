
public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[][] = new String[3][4];
		str[0][0]="email@gmail.com";
		str[0][1]="920473820";
		str[0][2]="pass1234";
		str[0][3]="Chrome";
		
		str[1][0]="email1@gmail.com";
		str[1][1]="920473820";
		str[1][2]="pass1234";
		str[1][3]="Mozilla";
		
		str[2][0]="email2@gmail.com";
		str[2][1]="920473820";
		str[2][2]="pass1234";
		str[2][3]="Edge";
		
		System.out.println("Length of String: "+str.length);
		System.out.println("Length of str[0]: "+str[0].length);
		for(int rNum=0;rNum<str.length;rNum++) {
			System.out.println("Row number is :"+rNum);
			for(int cNum=0;cNum<str[rNum].length;cNum++) {
				String data = str[rNum][cNum];
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		String trans = "Your order is processed. Transaction Id is 1234567890";
		String ResultArray[] = trans.split("is");
		System.out.println(ResultArray.length);
		System.out.println(ResultArray[0]);
		System.out.println(ResultArray[1]);
		System.out.println(ResultArray[2]);
		
		int iArr[]=new int[3];
		iArr[0]=100;
		iArr[1]=200;
		iArr[2]=300;
		
		Object[] data=new Object[5];
		data[0]="Hello";
		data[1]=100;
		data[2]=19.25;
		data[4]=true;
		
		
		
		
		
	}

}
