package Basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int income;
        Scanner sc = new Scanner(System.in);

        // if - elseif- else
       /* System.out.println("Enter your Income");
        income = sc.nextInt();

        if(income > 100000){
            System.out.println("You are under Top 5% people in india");
        }
        else if(income > 90000){
            System.out.println("You are under Top 10% people in india");
        }
        else if(income > 50000){
            System.out.println("You are under Top 20% people in india");
        }
        else if(income > 30000){
            System.out.println("You are under Top 40% people in india");
        }
        else if(income > 20000){
            System.out.println("You are under Top 50% people in india");
        }
        else{
            System.out.println("Aap khi to aa rhe ho");
        }*/



        /*System.out.println("Enter Your Income ");
        income = sc.nextInt();*/

        //If statement
        /*if(income > 10000){
            System.out.println("Main Ameer hu");
        }
        else{
            System.out.println("Main Ameer nhi hu");
        }*/

     /*   int age;
        System.out.println("Enter Your Age");
        age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }*/

        // Ternary operator
//        System.out.println( (income > 100000) ? "Ameer hu" : "Ameer nhi hu");

        //Nested if else conditon
/*
        int age ;
        System.out.println("Enter Your age");
        age = sc.nextInt();
        boolean driving;
        System.out.println("Ok, now tell me that Do you Know Driving? ");
        driving = sc.nextBoolean();*/
/*        if(age >= 18){
            System.out.println("Your age is : " + age);
            if(driving == true){
                System.out.println("And You can get a licence");
            }
            else{
                System.out.println("Phle driving sikh kr aa");
            }
        }
        else {
            System.out.println("Phle bda toh ho ja bhai licence ke liye");
        }*/

     /*   if(age >= 18 && driving == true){
            System.out.println("You can get a licence");
        }
        else{
            System.out.println("Either you are under 18 or you don't know driving skill");
        }
*/

        // Switch case
        int day = sc.nextInt();
        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Sunday lelo");
            sc.close();
        }
    }
}
