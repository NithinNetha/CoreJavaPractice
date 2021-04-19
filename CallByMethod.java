package lab1;

public class CallByMethod {
	int a=200;
	int method(int a) {
		int res=a/10;
		return res;
	}
	public static void main(String[] args) {
		CallByMethod cb = new CallByMethod();
		System.out.println("Calling Method with variable "+cb.method(cb.a));
		System.out.println("Calling with value "+cb.method(400));
	}

}
