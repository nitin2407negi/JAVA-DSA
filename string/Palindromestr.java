public class Palindromestr {
    public static void main(String[] args) {
        String str="nitin";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("it's a palindrome string");
        }
        else{
            System.out.println("not a palindrome string");
        }
    }
}
