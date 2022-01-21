//fibanocci sequence
import java.util.*;
class c {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,a=0,b=1,c;
        System.out.println("Enter  number:");
        int x=obj.nextInt();
        for(i=0;i<x;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}