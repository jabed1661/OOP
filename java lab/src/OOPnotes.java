//import java.util.Scanner;
import java.util.*;
import My.infor;
class Student
{
    String name;
    int id;

    public void print()
    {
        System.out.println("Name: "+this.name+"\n"+"id: "+this.id);
    }
    //non-perameter constructor
    Student ()
    {

    }

    //peramiter constructor.
   /* Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }*/

    //copy constructor (one constructor copy the value of another constructor)
    Student(Student s2)
    {
        this.name = s2.name;
        this.id = s2.id;
    }

    //polymorphism --- poly(many) morphism(form) (its called function over loding)
    // different different function name same defined. for this when we passed variable the function automatic catch the which are called
    // every function has must be some different
    // types - 1. Run time polymorphism 2. Compile time

    //compile time polymorphism
    public void result(String name){
        System.out.println(this.name);
    }
    public void result(int id){
        System.out.println(this.id);
    }
    public void result(String name,int id){
        System.out.println(this.name+" "+this.id);

    }
}
// Inheritance


public class OOPnotes {

    public static void main(String args[])
    {
        Student s1 = new Student();// Student() its called constructor(No return type)
        /* Constructor 2types
        1.peramiter
        2.non-peramiter.
         */
       s1.name = "Jabed";
       s1.id = 66;
        Student s2 = new Student(s1);
        s2.print();
        s1.result(s1.id);
        s1.result(s1.name,s1.id);
        s1.result(s2.name,s1.id);
        My.infor x= new My.infor();
        x.name = "Jabed";










    }

    }