package Basics;

public class dType {
    public static void main(String[] args) {
        // Boolean
       /* boolean Name = true;
        boolean name2 = false;
//        boolean massao = 1;
        System.out.println(Name = !false);*/

        //Character
        char ch = 'S';
        /*char c;
        c+=1;
        System.out.println(c);*/
        System.out.println("My character is : " + (char)(ch+1));



        //Integers -> byte, Short, int, long
        byte marks = 120;
        System.out.println(marks);

        short weight = 32700;
        System.out.println(weight);

        int number = 1234487474;
        System.out.println(number);

        long length = 1000000000000000000l;
        System.out.println(length);


        // decimal points
        float numbers = 123.27376344444444f;
        System.out.println("floating point number is : " + numbers);

        double percentage = 99.9999936223665363565763576;
        System.out.println(percentage);


        //Implesit conversion
        byte num1 = 30;
        short num3 = num1;
        int num2 = num3;
        long num4 = num2;
        System.out.println("final converted value is : " + num4);

        //Explecit conversion

        int num = 87;
        char cha = (char)num;
        System.out.println(cha);

        int mynum = 500;
        byte mynum2 = (byte) mynum;
        System.out.println(mynum2);
    }
}
