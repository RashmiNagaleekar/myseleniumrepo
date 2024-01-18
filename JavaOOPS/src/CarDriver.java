
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car();
		c1.name="A";
		c1.price=100000;
		c1.mod="new";
		
		Car c2=new Car();
		new Car();
		new Car();
		new Car();
		
		Car c3=new Car("B",200000,"old");
		System.out.println(c3.name);
		System.out.println(c3.price);
		System.out.println(c3.mod);
	}

}
