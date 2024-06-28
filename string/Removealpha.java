public class Removealpha{
    public static void main(String[] args) {
        String str="hel1456lo56wor%^ld";
        str=str.replaceAll("[^a-zA-Z]", "");
        System.out.println("after removing alphabet="+str);
    }
}