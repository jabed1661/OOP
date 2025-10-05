public class Tthread {
    public static void main(String[] args)
    {
        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("THreas2");
        MyThread t3 = new MyThread("THread3");
        System.out.println("Star thread before star: "+t1.getState());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Start thered After start: "+t2.getState());


    }
}
class MyThread extends Thread   {
    private String ThreadName;

    MyThread(String name)
    {
        this.ThreadName =name;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);


        }
    }
}
class MyRunnable implements Runnable{

    public void run() {
        System.out.println("Runnable is running");
    }
}
