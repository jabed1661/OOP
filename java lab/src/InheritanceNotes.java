//inheritance 4 types:
/*
 1. Single level inheritance
 2. Multilevel Inheritance-
 3. Hierarchical Inheritance - 1 base class multipal subclass or derive class
 4. Hybrid Inheritance - different different inheritance find.



 */

class Shape {
     public void area1()
     {
         System.out.println("Display the area: ");
     }
}
class Triangle extends Shape {
    public void area() {
        int x = 10, y = 20;
        int sum = x * y;
        area1();
        System.out.println(sum );
        }
}
class EquilateralTriangle extends Triangle{
    public void s()
    {
        area();
        int x= 12,y=52;
        System.out.println(x+y);

    }
}

public class InheritanceNotes {

    public static void main(String args[]) {

        EquilateralTriangle ti = new EquilateralTriangle();

           // ti.color = "red";
            ti.s();
            ti.area();
            //Account m = new Account();





    }
}

