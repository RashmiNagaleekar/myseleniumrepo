package Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//in a list there is no final size, it will dynamically grow
		List<String> l = new ArrayList<String>();
		System.out.println(l.size());
		l.add("Apple");
		l.add("Orange");
		l.add("Mango");
		l.add("Kiwi");
		System.out.println("l size: "+l.size());
		System.out.println("Value of index[1] is "+l.get(1));
		
		//for loop based on Index
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		//Type of list
		for(String s : l) {
			System.out.println(s);
		}
		
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(100);
		l1.add(10000);
		System.out.println("l1 size: "+l1.size());
		
		List l2 = new ArrayList();
		l2.add("Rashmi");
		l2.add(100);
		l2.add('a');
		System.out.println("l2 size: "+l2.size());



		Hashtable<String,String> table = new Hashtable<String,String>();//key, value pairs
		table.put("name", "Rashmi");
		table.put("place", "Bangalore");
		table.put("tool", "Selenium");//key should be different
		table.put("key", "value");
		
		System.out.println(table.get("place"));
		System.out.println(table.get("tool"));
		
		
	}

}
