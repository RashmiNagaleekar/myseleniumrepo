
public class Q7qtpselenium {
		public static void main(String[] args) {
		int x[] = { 1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6, 311,1 };
		// arrange in ascending order
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					}
				}
			}
		// print ascending order array
		for (int i = 0; i < x.length; i++) {
			System.out.println("Array in ascending order -> " + x[i]);
		}
		int c = 1;
		for (int i = 0; i < x.length; i++) {
			int currentValue = x[i];
			int nextValue = 0;
			try {
				nextValue = x[i + 1];
				} catch (Exception e) {
		}
		if (currentValue != nextValue) {
			System.out.println(x[i] + " repeated " + c + " times ");
			c = 1;
			} 
		else {
			c++;
		}
		}
		}
		}
