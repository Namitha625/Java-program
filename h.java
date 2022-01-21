//factor of a number
import java.util.*;
class h
{
    public static void main(String args[])
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=obj.nextInt();
        int i;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            System.out.println("Factors:"+i);
        }
    }
}
