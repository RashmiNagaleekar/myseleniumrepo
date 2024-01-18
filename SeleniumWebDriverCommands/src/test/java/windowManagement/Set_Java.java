package windowManagement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Set holds unique elements
		//no final size
		//no index
		//no order
		Set s = new HashSet();
		System.out.println(s.size());
		s.add("India");
		s.add("USA");
		s.add("Japan");
		s.add("Japan");//duplicates are not added
		System.out.println(s.size());
		Iterator it = s.iterator();
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
