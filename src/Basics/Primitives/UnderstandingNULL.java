package Basics.Primitives;


public class UnderstandingNULL {

    static Object myobj = new Object();
    static String name;
    //static String MyNAME="MAHTESWARAN";
    static int a;

    public static void main(String[] args) {

          System.out.println("myobj ="+myobj);
          System.out.println(a);

        String MyNAME="MAHTESWARAN";
        MyNAME.toLowerCase();
        System.out.println("MyNAME In Lower Case "+MyNAME);  // Lower case not converted ? why ?


        name.toLowerCase();
          System.out.println(name); // NULL Pointer EXCEPTION



    }




}
