import java.util.*;
class Swapp
{
    public static void swap(ArrayList<Integer>list,int indx1,int indx2)
    {
        int temp=list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(10);
        int indx1=0,indx2=4;
        System.out.println("list before swap="+list);
        swap(list,indx1,indx2);
        System.out.println("list after swap="+list);
    }

}