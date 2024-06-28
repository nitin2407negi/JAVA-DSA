public class Countsum {
    public static void main(String[] args) {
        String str="4PREP5Insta3";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                sum=sum+Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("sum of number in string are:"+sum);

    }
}
