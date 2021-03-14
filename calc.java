package lab1;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int ch=0; 
		
		do {
			System.out.println(" 1.Addition \n 2. Substraction\n 3.Multiplication \n 4.Division");
			System.out.println(" 5.Exit \nEnter your choice: ");
			ch=s.nextInt();
		switch(ch) {
		case 1:
			System.out.print("Enter First number: ");
			float x=s.nextFloat();
			System.out.print("Enter Second number: ");
			float y=s.nextFloat();
			System.out.println("Answer is "+add(x,y));
			break;
		case 2:
			sub();
			break;
		case 3:
			mul();
			break;
		case 4:
			System.out.print("Enter First number: ");
			x=s.nextFloat();
			System.out.print("Enter Second number: ");
			y=s.nextFloat();
			div(x,y);
			break;
		}
		}while (ch<5);
	}
	static float add(float a, float b) {
		return a+b;
	}
	static void sub() {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter First number: ");
		float a=s.nextFloat();
		System.out.print("Enter Second number: ");
		float b=s.nextFloat();
		System.out.println("Answer is "+(a-b));
	}
	static void mul() {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter First number: ");
		float a=s.nextFloat();
		System.out.print("Enter Second number: ");
		float b=s.nextFloat();
		System.out.println("Answer is "+(a*b));
	}
	static void div(float a,float b) {
		if(b==0) {
			System.out.println("Numbers cannot be divided by zero");
		}
		else System.out.println("Answer is "+(a/b));
	}
}
