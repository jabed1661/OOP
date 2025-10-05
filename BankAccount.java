abstract class BankAccount{
    protected String accountNumber;
    protected String hoolderName;
    protected double balance;
    
    public  BankAccount(String accountNumber,String hoolderName,double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.hoolderName = hoolderName;

    }
    public void deposit(double amount)
    {
        if(amount>0){
        balance+= amount;
        }
        else
        {
            System.out.println("Invalid Balance");
        }
    }
   
    abstract void withdarw(double amount);
    
   abstract public void calculateInterest();
   public void display()
   {
    System.out.println("Total balance "+balance);
   }
    
}
class SavingAccount extends BankAccount
{
    public static final double InterestRate = 0.04;
    public static final double MinimumBalance = 500;
    public static final double Penalty =50;
    public SavingAccount(String accountNumber,String holderName,double)
    public void calculateInterest(double amount)
    {
        amount = balance* InterestRate;
    }


}
