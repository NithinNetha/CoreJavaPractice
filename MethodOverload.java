package lab1;

public class MethodOverload {

	public void area(int a, int b) {
	 System.out.println("Area of Rectangle is "+a*b);
	}
	public void area(int a) {
		System.out.println("Area of circle is "+3.14*a*a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload mo = new MethodOverload();
		mo.area(15,7);
		mo.area(8);

	}

}