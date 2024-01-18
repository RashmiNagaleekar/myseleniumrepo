
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] ={1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<x.length;i++) {
			if(x[i]>max)
				max=x[i];
		}
		
		int y[] = new int[max+1];
		for(int i=0;i<x.length;i++) {
			y[x[i]]++;
		}
		for(int i=0;i<=max;i++) {
			if(y[i]>1) {
				System.out.println(i+ "-"+y[i]);
			}
		}
		
		
	}

}
