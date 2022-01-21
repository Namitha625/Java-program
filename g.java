//given number is armstrong or not
import java.util.*;
class g
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter  number:");
        int x=obj.nextInt();
        while(x>0)
        {
            int r=x%10;
            int t=r*r*r;
            sum=sum+t;
            x=x/10;
        }
        if(sum==x)
        {
            System.out.println("It is armstrong"); 
        }
        else
        {
            System.out.println("It is not  armstrong"); 
        
        }
    }
}