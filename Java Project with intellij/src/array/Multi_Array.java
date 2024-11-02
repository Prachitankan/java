package array;

public class Multi_Array {
    public static void main(String[] args) {

        //creation
//        int arr[][] = new int[4][5];

        //initialization
        int arr[][] = {
                {10,5,8},
                {7,9,12},
                {20,4,10}
        };

        //printing of array
        for(int [] temp : arr){
            for (int num: temp){
                System.out.println(num);
            }
        }


        // Practice

        //QN :  Printing sum of all array
        int sum = 0;
        for(int [] temp : arr){
            for (int num: temp){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
