package src;

public class Lab_020 {
    public static void main(String[] args) {
        //Relational Operators
        // >, < >=,<=, == , != ( ! = )

         int age_A = 30;
         int age_B = 23;

        boolean result = age_A > age_B;
        System.out.println(result);


        int a = 10;
        int b =30;
        boolean c =(a<b); // it checks for the referencing like where it is actually present in jvm , there is a memory where a=10 and b=10 is present and they both are reference to the same.
        System.out.println(c); //means where they are present

        // Reference  int - value, string - ref
//        In case of reference the check is different like int is refer to value and in case of string it checks for refernce//


    }
}
