
class Palinchat
{
    public static boolean Ispalin(String s)
    {
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[])
    {
        String s="Nitinn";
        if(Ispalin(s))
        System.out.println("palindrome");
        else
        System.out.println("notpalin");
    }
}