package oops_in_java;

public class Student{
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Constructor

    // Default constructor
  /*  public Student(){
        System.out.println("Student default constructor is called");
    }*/

    // Parametric constructor
    public Student(int id, int age, String name, int nos){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Behaviour
    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunking(){
        System.out.println(name + " bunking");
    }
}