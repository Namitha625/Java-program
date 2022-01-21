//factorial of a given number
import java.util.*;
class f
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter  number:");
        int x=obj.nextInt();
        int i,fact=1;
        for(i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is:"+fact);
    }
}
