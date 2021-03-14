package lab1;

public class accessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		specificModifier obj = new specificModifier();
		obj.display();
	}

}
class specificModifier {
	void display() {
		System.out.println("Inside specificModifier Display method");
	}
}
