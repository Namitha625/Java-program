//checking wheather the number is pallindrome or not
import java.util.*;
class i
{
    public static void main(String args[])
    {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter number:");
            int a=obj.nextInt();
            int num,digit,rev=0;
            num=a;
            while(a>0)
            {
                digit=a%10;
                rev=(rev*10)+digit;
                a=a/10;
            }
            if(rev==num)
                System.out.println("It is pallindrome");
            else
                System.out.println("It is not");
        }
    }
}
