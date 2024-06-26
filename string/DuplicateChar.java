public class DuplicateChar {
    public static void main(String[] args) {
        String str="Appllee";
        char ch[]=str.toCharArray();
        System.out.println("the string is="+str);
        System.out.print("duplicates charter in string are:");
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[j]+",");
                    break;
                }
            }
        }
    }
}


/*
 * q1=why string are immutable
 * ans=Immutable means something that cannot be changed once it's created. In Java, strings are immutable, meaning once you create a string, you cannot change it.

Reasons for Immutability
Security:

If you have a string like a password or a file path, immutability ensures that no one can change it after it is created. This keeps your data safe.
Performance:

String Pool: Java stores a lot of strings in a special area called the string pool. If two strings are the same, Java can use the same string object for both. This saves memory.
Caching: When you perform operations like finding the length of a string or its hash code (used in data structures like HashMap), Java can store this information the first time it calculates it. Since the string doesn't change, these values don't need to be recalculated.
Simplicity:

It's easier to understand and debug programs when you know that the value of a string won't change unexpectedly.
 */
