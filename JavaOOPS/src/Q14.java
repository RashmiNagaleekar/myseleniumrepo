
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] ={1,7774,989,738,8902};

		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(x[i]>x[j]){
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}

		System.out.println("Greatest number in an array is: "+x[0]);
		
		}

}
