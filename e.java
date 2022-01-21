//given number is prime or not
import java.util.*;
class e 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter  number:");
        int x=obj.nextInt();
        int i,flag=0;
        for(i=0;i<x/2;i++)
        {
            if(x%2==0)
            {
                flag=1;
                System.out.println("it is not prime");
                break;
            }
        if(flag==0)
        {
            System.out.println("It is prime");
        }    
        }
    } 
}      