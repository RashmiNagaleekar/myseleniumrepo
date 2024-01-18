package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//no duplicates elements are allowed
		//no indexing 
		//Set is un-ordered
		Set<String> s = new HashSet<String>();
		System.out.println("Size of Set before adding items to Set: "+s.size());
		s.add("India");
		s.add("Indonasia");
		s.add("China");
		s.add("UK");
		s.add("UK");
		System.out.println("Size of Set after adding items to Set: "+s.size());
		
		Iterator<String> it = s.iterator();
		System.out.println(it.next());
		System.out.println("------Inside While Loop-----");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
