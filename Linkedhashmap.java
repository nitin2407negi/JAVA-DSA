import java.util.*;
class Linkedhashmap
{
    //linkedhashmap=>insertion inordered
    public static void main(String args[])
    {
        //creating linked hash map
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        //inserting=>O(1)
         hm.put("india",150);
         hm.put("china",100);
         hm.put("england",300);
         System.out.println(hm);

    }
}