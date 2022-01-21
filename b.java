//find sum of first n natural numbers
import java.util.*;
class b
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter  number:");
        int a=obj.nextInt();
        int i,sum=0;
        for(i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum="+sum);
    }
}       