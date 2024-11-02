package Basics;

public class operators {
    public static void main(String[] args) {
        //arthematic operator
        int num1 = 30;
        int num2 = 40;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println((double) num2 / num1);
        System.out.println(num2 % num1);

        //Relational operator
       /* int a = 10;
        int b = 20;
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        */

        //Logical operator
       /* int a = 10;
        int b = 20;
        int c = 30;
        boolean cond1 = (a<b);
        boolean cond2 = (b<c);
        boolean cond3 = (a<c);

        boolean ans1 = (cond1 && cond2 && cond3);
        System.out.println(ans1);

        boolean ans2 = (cond1 || cond2 || cond3);
        System.out.println(ans2);

        boolean ans3 = !cond1;
        System.out.println(ans3);*/

        // Assignment Basics.operators
        int Age = 10;
        Age += 20;
        System.out.println(Age);

        Age -= 2;
        System.out.println(Age);

        Age *= 3;
        System.out.println(Age);

        Age /= 2;
        System.out.println(Age);

        Age %= 8;
        System.out.println(Age);

        //Unary operator

//        (++)
        int val = 10;
        System.out.println(val++);
        System.out.println(++val);

        // (--)
        System.out.println(--val);
        System.out.println(val--);
    }
}
