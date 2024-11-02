package oops_in_java;

public class App {
    public static void main(String[] args) {
//        System.out.println("hello world");
        //Default constructor
        Student A = new Student(10,20,"Kazama",8);
        //Paramatric constructor
        System.out.println("before updation");
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println("After updation");
        A.name = "Massao";
        A.age = 20;
        A.id = 382601;
        A.nos = 5;
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);


        A.bunking();
        A.study();
        A.sleep();

//        obj2
        Student B = new Student(123,12,"Shinchan",3);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);


        B.bunking();
        B.study();
        B.sleep();
    }
}
