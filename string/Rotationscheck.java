//Write a Code to check whether one string is a rotation of another
public class Rotationscheck {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotations of each other");
        } else {
            String temp = str1 + str1;
            if (temp.contains(str2)) {
                System.out.println("Strings are rotations of each other");
            } else {
                System.out.println("Strings are not rotations of each other");
            }
        }
    }
}

