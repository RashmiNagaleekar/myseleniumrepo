interface IShape {
void f();
}

class Circle implements IShape {

public void f() {
System.out.println("Interface");
}
public void c() {
System.out.println("class");
}
}

public class Main {

public static void main(String[] args) {

IShape obj = new Circle();
obj.f();
}
}

