package Basics;

public class EqualmethodVSEqual {
	

    public static void main(String[] args) {
		
    	String a ="12";
    	String b ="12";
    	
    	String s1 = new String("HELLO");
    	String s2 = new String("HELLO WORLD");
    	
    	System.out.println(s1==s2); // compares the memory address / object referneces of the string
    	
    	System.out.println(s1.equals(s2));
    	System.out.println(s1);  
    	System.out.println(s2);
     	
    	
        
    	
	}


}
