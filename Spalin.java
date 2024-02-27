import java.util.*;
class Spalin
{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        String str;
        System.out.println("enter the string to check the string is palin or not");
        str=ip.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
           rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("palindrome");

        }
        else{
            System.out.println("not palindrome");
        }
        ip.close();

    }
}