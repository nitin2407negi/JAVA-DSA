import java.util.*;
class Hashmap
{
    public static void main(String args[])
    {
    //creating hashmap
    HashMap<String,Integer> map=new HashMap<>();

    //inserting=>O(1)
    map.put("india",150);
    map.put("china",100);
    map.put("england",300);

    //print
    System.out.println(map);

    //get function=>O(1)
    int population=map.get("india");
    System.out.println(population);

    //contains key=>O(1)=>give result in boolean value
    System.out.println(map.containsKey("india"));

    //removeO(1)
    map.remove("england");
    System.out.println(map);

    //size
    System.out.println(map.size());

    //iteration
     Set<String> keys=map.keySet();
     System.out.println(keys);
     
     for (String k : keys) {
        System.out.println("key="+k+" value="+map.get(k));
     }



    }

 
}