package Basics.Primitives;

import static java.lang.System.*;


public class PrimitiveNumbers {

    public void octalnumbers(){
        // Octal Starts from (0-7)

        int firstoct = 012;
        int secondoct =212;
        int thirdoct = 883;
        int sumoct = firstoct+secondoct+thirdoct;
         out.println("Octal As Decimal"+sumoct); // 1105
        out.println("Octal Numbers "+firstoct+" "+secondoct+" "+thirdoct);

    }

    public void hexadecimalnumbers(){

        // Hexadecimal starts from (0-7) & (A-F)

        int firsthexa = 0xF;
        int secondhexa  = 0xAB;
        int Sumhexa = firsthexa+secondhexa;
        out.println(firsthexa+" "+ secondhexa);
        out.println("HEXA NUMBERS"+Integer.toHexString(Sumhexa));
        out.println("Hexa As Decimal"+Sumhexa);
    }

    public void BinaryNumbers(){

        // Binary should contain 0 or 1
        // Binary number system starts with ob (or) 0B

        int first_binary =0b11;
        int second_binary = 0b0011;

        int total_binary = first_binary+second_binary;
        out.println("Binary As Integer"+total_binary);
        out.println("Binary NUMBERS"+first_binary+" "+second_binary);
    }



    public static void main(String[] args) {
        PrimitiveNumbers pn = new PrimitiveNumbers();
        pn.octalnumbers();
        pn.BinaryNumbers();
        pn.hexadecimalnumbers();
    }

}
