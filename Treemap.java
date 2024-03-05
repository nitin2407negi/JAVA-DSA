import java.util.*;
class Treemap
{
    //treemap=>keys are sorted
    public static void main(String args[])
    {
        //creating tree map
        TreeMap<String,Integer> tm=new TreeMap<>();
        //inserting=>O(logn)
        //tree map implement using red black tree(special type of bst tree which is self balancing)
         tm.put("india",150);
         tm.put("china",100);
         tm.put("england",300);
         System.out.println(tm);

    }
}