package lab1;
class EmpInfo{
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}
}
class Std{
	int id;
	String name;
	Std(int i, String n){
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}
public class constructorDemo {

	public static void main(String[] args) {
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();
		System.out.println("Regular Constructor Demo");
		emp1.display();
		emp2.display();
		System.out.println("Parametrized Constructor Demo");
		Std std1=new Std(2,"Alex");
		Std std2=new Std(10,"Annie");
		std1.display();
		std2.display();
	}
}
