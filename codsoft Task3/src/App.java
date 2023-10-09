import java.util.Scanner;
class mybank
{
    private double balance;
    public mybank (double initialBalance)
    {
        this.balance = initialBalance;
    }
    public double  getBalance()
    {
        return balance;
    }
        public void deposit (int amount)
    {
        if (amount > 0)
        {
            balance+=amount;
            System.out.println("deposit successful"+balance);
        }
        else
        {
            System.out.println("invalid deposit amount") ;
        }   
    }
    public boolean withdraw (double amount)
    {
        if (amount>500)
        {
            if (amount <= balance) 
            {
            balance-=amount;
            System.out.println("Withdrawal successfully,new balance is:"+balance);
            return true;
            }
            else
            {
            System.out.println("Insufficient balance for withdraw so current balance"+balance);
            }
        }
        else
        {
            System.out.println("Insufficient balance so please enter the amount above five hundred");
        }   
    return false;
    }
}
class ATM
{   int choice=0;
    private mybank bankAccount;
    public ATM(mybank bankAccount)
    {
        this.bankAccount=bankAccount;
    }
    public void displayMenu()
    {
        System.out.println("ATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void run()
    {   
        Scanner scanner =new Scanner(System.in);
        while(choice!=4)
        {
            displayMenu();
            System.out.println("Enter the choice");
            choice =scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Current balance:$"+bankAccount.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the deposit amount:$");
                    int depositeAmount=scanner.nextInt();
                    bankAccount.deposit(depositeAmount);
                    break;
                case 3:
                    System.out.println("Enter the withdrawal amount:$");
                    double withdrawalAmount=scanner.nextDouble();
                    boolean withdrawSuccess=bankAccount.withdraw(withdrawalAmount);
                    if(withdrawSuccess)
                    {
                        System.out.println("withdrawal successful.");
                    }
                    break;                    
                case 4:
                    System.out.println("Thank u for using ATM");
                    break;                   
                default:
                    System.out.println("Invalid choice .please try again");                             

            }
        }
    }
}
class demo
{
    public static void main(String[] args)
    {
        mybank Accountbalance=new mybank(1000.0);
        ATM atm=new ATM(Accountbalance);
        atm.run();
    }
}