package Basics;

public class UnaryOperatorP1 {

	public static void main(String[] args) {
		
		int x =+3; // "+" sign is redundant
		
		System.out.println("x ="+x);
		
		double y = -x;
		System.out.print("y ="+y); // Simply doing multiplication -1 * 3
		
		boolean A = true;
		boolean b =!A;
		
		System.out.println("B ="+b);
		
		// Important Note Code
		
		int count =0;
		
		System.out.print(count); //0
		System.out.print(count++); //0
		System.out.print(++count); //2
		System.out.print(count--); //2
		System.out.print(count); //1
		System.out.print(--count); //0
		System.out.print(count--); //0
		System.out.print(count); //-1
		
		
		
		
		
		
		
		
		
		

	}

}
