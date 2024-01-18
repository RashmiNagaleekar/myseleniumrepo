package Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		String operation = "add";
		int x = 10;
		int y = 20;
		
		Operations op1 = new Operations();
		op1.add(10, 20);
		op1.diff(10, 5);
		op1.mul(10, 20);
		op1.div(10, 5);
		
		/*
		if(operation.equals("add")) {
			op.add(x, y);
		}
		else if(operation.equals("diff")) {
			op.diff(x, y);
		}
		else if(operation.equals("mul")) {
			op.mul(x, y);
		}
		else if(operation.equals("div")) {
			op.div(x, y);
		}
		*/
		
		Operations op = new Operations();
		Method m = op.getClass().getMethod(operation, int.class, int.class);
		m.invoke(op, x,y);
		
	}

}
