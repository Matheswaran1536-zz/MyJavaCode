package Basics;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 2+2+4*3-1;
        System.out.println("A = "+a);

        int f = 6;

        int a1 = 3 - 2 * f--; // Use And then Decrement
        System.out.println("A1 ="+a1);

        int a2 = 3 - 2 * --f; // Decrement Then use
        System.out.println("A2 ="+a2);


        double a3 = 3 - 2 * f++;   // Use and Increment
        System.out.println("A3 ="+a3);


        double a4 = 3 - 2 * ++f;    // Increment And User
        System.out.println("A3 ="+a4);


        int a5 = 10- 3 * (2 +1) - 4  / (1 + 3);
        // 10 - 3 * 3 - 4 / 4
        // 10 - 9 - 1
        // 0
        System.out.println("A5 ="+a5);


        int a6 = 10, a7=3;
        int a8 = a6 % 17;
        System.out.println("A8 = "+a8);


        int fa = 12,g=5,h=2;
        int ma = fa / 2 - 10 % (4+3) - 2 * fa % g - h * 3;
        // 12 / 2 - 10 % (4 + 3) - 2 * 12 % 5 - 2 * 3
        // 12 / 2 - 10 % 7 - 24 % 5 - 6
        // 6 - 3 - 4 - 6
        // 3 - 10
        // - 7
        System.out.println("MA = "+ ma);






    }
}
