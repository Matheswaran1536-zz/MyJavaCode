package Basics;



public class AssignmentOperator {
	
	
	// Compound Assignment Operator
	public int CompundAssignmentOperator() { 
		
		int a = 10;
		int b = 20;
		int c = (b = 2);
		System.out.print("Compound Assignment C Value = "+c);
		return c;
		
	}

	public static void main(String[] args) {
		
		byte one = 127;
		byte two = -128;
		
		// Byte range (-127 to 128)
		
		one++;
		two--;
		System.out.println("One ="+one);
		System.out.println("Two ="+two);
		
		AssignmentOperator AO = new AssignmentOperator();
		AO.CompundAssignmentOperator();
		
		
		

	}

}
