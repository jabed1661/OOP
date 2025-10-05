
import java.util.*;

public class string {
    private static char oldChar;

    static void sum()
    {

        Scanner ab = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = ab.nextInt();
        System.out.print("Enter the secound number : ");
        int y = ab.nextInt();
        int result=0;
        for(int i=x;i<y;i++)
        {
            if (x%2==0)
            {
                result = x+y;
            }
            else
            {
                result = x*y;
            }

        }
        System.out.println("The sum of this code is : "+result);

    }
    public static void main(String[] area){
        System.out.print("New line asbe na ");
        System.out.println("Ei line er por notun output new line a asbe");
        /*
        function of string
        1. Concatenate = To connect 2 string
        2. charAt = find the value using index number
        3. length = find the length
        4. Replace
        5.substring

         */
        //Concatenate
        String name = "Jabed";
        String name1 = "Hossain";
        String name2= name+" "+name1;
        int age =30;
        System.out.println(name+" "+age+" years old");
        System.out.println(name2);

        //charAt
        System.out.println(name.charAt(0));


        //length
        System.out.println(name1.length());

        //replace
        String name4 = name.replace('J','S');
        String name5 = name1.replace('H','S');
        System.out.println(name5);
        System.out.println(name4);

        //substring
        System.out.println(name2.substring(0,5));



        //array
        // in java if we cannot inisialize the value if return null value
        int[] marks = new int[3];
        marks[0]=95;
        marks[1]=90;
        marks[2]=91;
        System.out.println(marks[2]);

        /*array function
        1.length
        2.sort
        3. Find maximum
         */

        //length
        System.out.println(marks.length);

        //sort
        System.out.println("Without sorting "+marks[0]+"\n"+marks[1]+"\n"+marks[2]);
        Arrays.sort(marks);
        System.out.println("With sorting "+ marks[0]+"\n"+marks[1]+"\n"+marks[2]);

        //find maximum from array

        int max1 = Arrays.stream(marks).max().getAsInt();
        System.out.println("Max number: "+max1);

        //2d array
        int[][] finalmarks = {{94,92,93},{92,93,26}};
        System.out.println(finalmarks[1][2]);

        //casting = convert one datatype to another datatype
        double value=18.30;
        double fv=value+20;
        System.out.println(fv);
        int v=18;
        int fc=v+(int)20.36;
        System.out.println(fc);

        //constant
        final float PI = 3.1416F;

        /*operators
        1. Arithmetic Operators
        2. Assignment Operators
        3. Logical Operators
        4. Comparison Operator
        */

        //Maths = Math.max and Math.min
        System.out.println(Math.max(5,9));
        System.out.println(Math.min(5,9));

        //random
        System.out.println((int)(Math.random()*100));

        //how to take Input?
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age: ");
        int y= sc.nextInt();
        System.out.println("age= "+y);

        //input for string = sc.next(only use for one sentence)/sc.nextline(for whole line);
        Scanner ac = new Scanner(System.in);
        System.out.println("Input your Name: ");

        //String  namei = sc.nextLine();
        String namez= ac.nextLine();
        System.out.println("Name = "+namez);

         //if else
        //pen=40,notebook= 10;
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        if(amount<10)
        {
            System.out.println("Cannot by anything.");
            System.out.println("Get more cash.");
        }
        else if(amount>10 && amount<50)
        {
            System.out.println("Bye only one thing");
        }
        else
        {
            System.out.println("Bye all off them");
        }

        //switch/case
        System.out.println("Day= ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("We-St");
        }
        sum();



    }

}
