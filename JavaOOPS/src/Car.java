
public class Car {

		String name;
		int price;
		String mod;
		
		public Car() {//called at object creation
			System.out.println("Inside Default Constructor");
		}

		public Car(String name, int price, String mod) {
			this.name=name;
			this.price=price;
			this.mod=mod;
		}
}
