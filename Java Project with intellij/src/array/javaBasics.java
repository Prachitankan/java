package array;

public class javaBasics {
    public static void main(String[] args) {
        //Declaration
        int arr[];
        int [] brr;

        //Allocation
        arr = new int[10];

        // initialization of array
        int marks[] = {10,100,20,30,70};
/*
        //Accessing element
        System.out.println(marks[3]);

        //check length of array
        System.out.println(marks.length);*/

        // using for loop print entire array

        for(int i=0; i<(marks.length); i++){
            System.out.println("Element at index "+ i +" is "+ marks[i]);
        }

        // using For each loop
        System.out.println("Using for Each loop");
        for(int number : marks){
            System.out.println(number);
        }
    }
}
