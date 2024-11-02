package Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //Create an object of Scaner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age");
        int age = sc.nextInt();
        System.out.println("Enter your float");
        float f = sc.nextFloat();
        System.out.println("Enter your bigIntiger");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("Your age is : " + age);
        System.out.println("Your float is : " + f);
        System.out.println("Your Big Int is : " + bg);

        sc.close();
    }
}
