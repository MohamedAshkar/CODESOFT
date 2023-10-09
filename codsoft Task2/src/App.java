import java.util.*;
class calculate
{Scanner ob=new Scanner (System.in);
int nos,total;
float percentage;
int arr[] = new int[1000]; 
    public void getmark()
    {   System.out.println("Enter the number of subject");
        int nos=ob.nextInt();
        for(int i=0;i<nos;i++)
        {   System.out.println("Enter the mark of subject"+i+1+":");
            arr[i]=ob.nextInt();
        }
   /* }
    public void totalmark()
    {  */
        int total=0;
        for(int i=0;i<nos;i++)
        {
            total=total+arr[i];
            
        }
        System.out.println("The total marks obtained is "+total);
        float percentage; 
        percentage = (total /nos); 
        System.out.println( "Total Percentage : " + percentage + "%");  
   /* }
    public void grade()
    { */
        if(percentage>=90)
        {
             System.out.println( "GRADE S");
        }
        else if(percentage>=80)
        {
             System.out.println( "GRADE A");
        }
        else if(percentage>=70)
        {
             System.out.println( "GRADE B");
        }
        else if(percentage>=60)
        {
             System.out.println( "GRADE C");
        }
        else if(percentage>=50)
        {
             System.out.println( "GRADE D");
        }
        else
        {
            System.out.println( "FAIL");
            
        }
    }
}
class demo
{   public static void main(String arg[])
    {
        calculate a=new calculate();
        a.getmark();
        //a.totalmark();
        //a.grade();
    }    
}