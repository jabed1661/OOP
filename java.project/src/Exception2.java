import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String []args)
    {
        int number = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ennter the number: ");
        try {
            number = sc.nextInt();
            if(number>10)
            {
                //Exception ap =  new Exception();
                throw new MyException();
            }
        }
        catch (Exception e)
        {
            System.out.println("Number cannot bigger than 10");

        }

    }
}
class MyException extends Exception{
    public MyException()
    {
        System.out.println("Its my Enception");
    }

}



