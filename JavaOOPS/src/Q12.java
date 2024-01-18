
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] ={31,4,98,9,2738,8902};
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(x[i]<x[j]){
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}

		System.out.println("Least number in an array is: "+x[0]);
		
		System.out.println("----From QTPSELENIUM");
		int y[] ={31,4,98,9,2738,8902};

		int s=y[0];
		for(int i=1;i<y.length;i++){

		if(s>y[i]){
		s=y[i];
		}
		}
		System.out.println(s);
		}
	}