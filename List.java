import java.util.*;
public class List
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        //adding element to the arraylist
        list.add(2);
        list.add(24);
        list.add(23);
        list.add(5);
        list.add(99);
        System.out.println("before deleting ="+list);
        //deleting element
        list.remove(1);
        System.out.println("after deleting"+list);

        //get operation
        int element=list.get(2);
        System.out.println("element at given index is="+element);
        
        //set operation

        list.set(1,24);
        System.out.println("list after set function="+list);

        //size operation

        System.out.println("size of arraylist="+list.size());

        //sort function

        Collections.sort(list);
        System.out.println("after sorting operation"+list);

        //contain function

        System.out.println(list.contains(24));


    }
}