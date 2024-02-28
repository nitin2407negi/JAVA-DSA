import java.util.Scanner;
class Palin
{
    int r,sum=0,no,no1;
    Scanner ip=new Scanner(System.in);
    void set()
    {
      System.out.println("enter number");
      no=ip.nextInt();
      no1=no;
    }
    void cal()
    {
        while(no>=1)
        {
            r=no%10;
            sum=sum*10+r;
            no=no/10;
        }
        if(no1==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
    public static void main(String args[])
    {
        Palin ob=new Palin();
        ob.set();
        ob.cal();
    }
}