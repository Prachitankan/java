package array;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();

        int []arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index " + (i+1));
            arr[i] = sc.nextInt();
        }

        //Q1: Find the sum of all values in array
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("Total sum of array elements is = " + sum);


        //Q2: Find Multiplication of all values in array
        int mul = 1;
        for(int num : arr){
            mul *= num;
        }
        System.out.println("Multiplication of array elements is = " + mul);


        //Q3 Find minimum value in array
        int min = (Integer.MAX_VALUE);
        for(int num : arr){
            if(num < min)
                min = num;
        }
        System.out.println("Min is " + min);


        //Q4 Find Maximum number
        int max = (Integer.MIN_VALUE);
        for(int num : arr){
            if(num > max)
                max = num;
        }
        System.out.println("Maximum is " + max);

    }
}
