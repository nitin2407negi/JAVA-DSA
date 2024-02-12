import java.util.*;
class Listreverse
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(10);

        //printing list berfore reverse
        System.out.println("list before rverse"+list);

        //reverse of arraylist logic and printing it
       // for(int i=list.size()-1;i>=0;i--)
      //  {
      //      System.out.print(list.get(i));
      //      System.out.print(",");
       // }
        
        //reverse through reverse operation
        Collections.reverse(list);

        System.out.println("list after reverse function="+list);
    }
}