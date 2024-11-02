package Basics;

import java.util.Scanner;

public class HWconditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1 : take age Basics.input and print if he/she can vote or not
       /* int age;
        age = sc.nextInt();

        // Ternary operation
        System.out.println((age >= 18) ? "can vote" : "can not vote");*/

        // Question 2: Take Basics.input 5 subjects marks and print the overall percentage of student

        /*float sub1, sub2, sub3, sub4, sub5;
        System.out.print("Enter your five subject marks : ");
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sub4 = sc.nextFloat();
        sub5 = sc.nextFloat();

        float percent = ((sub1+sub2+sub3+sub4+sub5)*100)/500;
        System.out.println("Your percentage of five subjects is : " + percent + '%');*/

        //Question 3: Take lowercase character and print its uppercase character
        /*System.out.println("Enter the lowercase character");
        char ch = sc.next().charAt(0);
        ch = (char)(((int)ch) - 32);
        System.out.println(ch);
*/

        //Question 4: Take UpperCase character and print its lowercase character
        /*System.out.println("Enter the uppercase character");
        char ch = sc.next().charAt(0);
        ch = (char)(((int)ch) + 32);
        System.out.println(ch);
        */


        //Question 5: Take Basics.input 5 subjects marks, drop the last one subject and print the overall 4 subject percentage of student

        float sub1, sub2, sub3, sub4, sub5;
        System.out.print("Enter your five subject marks : ");
        sub1 = sc.nextFloat();
        sub2 = sc.nextFloat();
        sub3 = sc.nextFloat();
        sub4 = sc.nextFloat();
        sub5 = sc.nextFloat();

        float percent = ((sub1+sub2+sub3+sub4)*100)/400;
        System.out.println("Your percentage of four subjects is : " + percent + '%');
        sc.close();
    }
}
