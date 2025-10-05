class Display{
    private int size;
    private String type;
    public Display(int size,String type)
    {
        this.size = size;
        this.type = type;
    }
    public void display()
    {
        System.out.println(size);
        System.out.println(type);
    }
}

class Battery{
    private double volt;
    public Battery(double volt)
    {
        this.volt =volt;
    }
    public void display()
    {
        System.out.println(volt);
    }
}

class Cell{
    private String band;
    private String no;
    private Display display;
    private Battery[] battary = new Battery[2];

    public Cell(String band,String no, Display display)
    {
        this.band =band;
        this.no = no;
        this.display = display;

        for(int i=0;i<2;i++)
        {
            battary[i] = new Battery(3.5);
        }
    }
    public void display()
    {
        System.out.println("Band : "+band);
        System.out.println("No: "+no);
        display.display();
        for(int i=0;i<2;i++)
        {
            battary[i].display();
        }
    }

}
public class Main2 {
    public static void main(String[] args)
    {
        Display s2 = new Display(10,"Amoleo");
        Cell s1 = new Cell("Samsung","SM-A515F",s2);
        s1.display();
       // s2.display();
    }
}
