package functions;

import java.util.Scanner;

public class functionHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Input Your name");
        String name = sc.nextLine();
        System.out.println("Just Enter how much time you want to print the name : ");
        int times = sc.nextInt();

        printName(name, times);*/

/*
        System.out.println("Enter the range");
        int n = sc.nextInt();
        Sum_N_num(n);*/

        /*System.out.println("Enter how many number average");
        int size = sc.nextInt();
        int arr [];
        arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }

        System.out.println(Average(arr, size));*/

        /*int min = min_of_num(32,8);
        System.out.println("Minimum number is : " + min);*/

/*        int max = max_of_num(32,8);
        System.out.println("Maximum number is : " + max);*/

//        System.out.println(getAbs(-40));

//        System.out.println(getExpo(2,5));

        System.out.println(GetRandom(2,8));

    }




    //Recursive  functions
    public static void printName(String name, int n){
        if (n == 0)
            return;
        System.out.println("Printing ... "+name);
        printName(name,n-1);
    }

    //WAF to print the sum from 1 to N
    public static void Sum_N_num(int n){
        int ans = 0;
        for(int i = 1; i<=n; i++){
            ans += i;
        }
        System.out.println("The sum of 1 to " + n + " is " + ans);
    }


    //WAF to return the average of 2 number

    public static float Average(int arr[], int n){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        float avg = sum/n;
        return avg;
    }



    //WAF to return minimum of two numbers
    public static int min_of_num(int n, int m){
        if(n > m)
            return m;
        return n;
    }

    //WAF to return maximum of two numbers
    public static int max_of_num(int n, int m){
        if(n < m)
            return m;
        return n;
    }


    //WAF to return the absolute value of a number

    public static int getAbs(int n){
        if(n > 0)
            return n;
        return (0-n);
    }


    //WAF to return the exponent of number
    public static int getExpo(int n, int m){
        int ans = 1;
        for(int i=1; i<=m; i++){
            ans *= n;
        }
        return ans;
    }

    //WAF to return a random number in between 1 to n
    public static int GetRandom(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
