
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Animal a = new Animal(); Can not create object of interface. Reference can be created but not an Object
	
		Cat c = new Cat();
		c.move();
		c.sleep();
		c.run();
		c.hunt();
		
		Animal a = new Cat();
		a.run();
		a.sleep();
		a.move();
		
		Animal a1 = new Elephant();
		a1.move();
		a1 = new Cat();
		a1.move();
		
		Animal a2 = null;
		a2 = new Elephant();
		a2 = new Cat();
		
	}

}
