import java.util.*;
public class Anagram{
    public static void main(String[] args) {
        String str1="prepinsta";
        String str2="instaprep";
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<str1.length();i++)
        {
            if(ch1[i]!=ch2[i]){
                System.out.println("not a anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}