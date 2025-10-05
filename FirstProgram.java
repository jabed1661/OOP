
public class FirstProgram{
    public double sum(int a,int b)
    {
        return (a+b);
    }
    public double sum(double a, double b)
    {
        return a+b;
    }
    public void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public FirstProgram()
    {

    }
    public FirstProgram(double a,double b)
    {
        double sum = a+b;

        System.out.println("The perameter sum is : "+sum);
    }

    public static void main(String[] args){
        FirstProgram f1 = new FirstProgram();
        int x =(int) f1.sum(5,10);
        FirstProgram f2 = new FirstProgram(10.2,20);
        double y = f1.sum(10.5, 20.5);
        System.out.println(y);

     f1.sum(5,10,5);
     System.out.println(x);
       //System.out.println(x);
        
    }
}
