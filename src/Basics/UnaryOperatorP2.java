package Basics;

public class UnaryOperatorP2 {

	public static void main(String[] args) {

		int a = 5;
		int b = ++a; // Increment and assign the same to a
		System.out.print("A ="+a+" "+"B ="+b);  // A=6 & b=6
		
		
		int newint = 5;
		int newotherint = newint++; // Assign and increment
		
		System.out.println("\nNewint ="+newint+" newotherint ="+newotherint);
		
		
		int g= 6;
		int h =2;
		
		int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
		
		System.out.print("I = "+i);
	}
}
