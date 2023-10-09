import java.util.*;
class randomnumber
{   int num;
    int gno;
    int atm=0;
    int total=0;
    Scanner ob=new Scanner (System.in);
    public void fun()
    {
    Random r=new Random();
    for(int i=0;i<1;i++)
    {
        num=r.nextInt(100);
    }
    }
    public void get()
    {if(atm<=2)
    {
    System.out.println("\nGuess the number and enter the number");
    gno=ob.nextInt();
    check();
    }
    }
    public void check()
    {
    if(gno==num)
    {
        System.out.println("\nthe guessed number is correct\n");
         if(atm==0)
    {System.out.println("\npoint is 20");
    total=total+20;
    }
    else if(atm==1)
    {System.out.println("\npoint is 10");
    total=total+10;
    }
    else if(atm==2)
    {System.out.println("\npoint is 5");
    total=total+5;
    }
    }
    else
    {   if(Math.abs(gno-num)<=5)
        {
        System.out.println("\nthe guessed number is  nearby 'too low'");
         }
        else
        {
        System.out.println("\nthe guessed number is far 'too high'");
         }
         atm=atm+1;
         if (atm==3)
         {System.out.println("\npoint is 0");
        }
        get();
    }
    }
    public void multipleround()
    {System.out.println("\nif u want to play multiple round then type yes");
    Scanner o=new Scanner(System.in);
    String mr=o.nextLine();
    atm=0;
    if(mr.equals("yes"))
    { fun();
      get();
      multipleround();
    }
    else
    {System.out.println("\nCLOSE");
    }
    }
}
class demo
{   public static void main(String arg[])
    { System.out.println("GAME GUESS THE NUMBER");
    System.out.println("\nRULE:\nOnly three chance to guess the number\n20 points in first attemt \n10 points in second attempt\n5 points in third attempt ");
    randomnumber a=new randomnumber();
    a.fun();
    a.get();
    a.multipleround();
    System.out.println("GAME OVER");
    System.out.println("Total point you scored is:"+a.total);
    }
  
}